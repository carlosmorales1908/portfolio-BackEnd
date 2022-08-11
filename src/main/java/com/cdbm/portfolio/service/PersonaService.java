package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Persona;
import com.cdbm.portfolio.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
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
    public boolean existePersonaMail(String mail){
        List<Persona> lisPersonas = persRep.findAll();
        for(Persona per: lisPersonas){
            if(mail.equals(per.getCorreo())){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void modificarPersona(Long id,Persona per){
        per.setId(id);
        persRep.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persRep.deleteById(id);
    }

    @Override
    public List<Persona> verPersonas() {
        return persRep.findAll();
    }
    
    @Override
    public boolean existeCorreo(String mail){
        return persRep.existsByCorreo(mail);
    }
    
    public Optional<Persona> getByNombreP(String nombre){
        return persRep.findByNombre(nombre);
    }
    
    
}
