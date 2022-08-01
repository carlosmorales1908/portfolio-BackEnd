package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Persona;
import com.cdbm.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persRep;

   

    @Override
    public void crearPersona(Persona per) {
        persRep.save(per);
    }
    
    @Override
    public Persona buscarPersona(Long id) {        
        return persRep.findById(id).orElse(null);
    }
    
    @Override
    public void modificarPersona(Long id,Persona per){
        if(buscarPersona(id)!=null){
            per.setId(id);
            persRep.save(per);
        }
    }

    @Override
    public void borrarPersona(Long id) {
        persRep.deleteById(id);
    }

     @Override
    public List<Persona> verPersonas() {
        return persRep.findAll();
    }
    
    
    
    
}
