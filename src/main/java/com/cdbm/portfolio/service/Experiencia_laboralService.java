package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Experiencia_laboral;
import com.cdbm.portfolio.repository.Experiencia_laboralRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Experiencia_laboralService implements IExperiencia_laboral{
    
    @Autowired
    public Experiencia_laboralRepository expRep;

    @Override
    public void crearExperiencia_laboral(Experiencia_laboral exp) {
        expRep.save(exp);
    }

    @Override
    public Experiencia_laboral buscarExperiencia_laboral(Long id) {
        return expRep.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia_laboral(Long id, Experiencia_laboral exp) {
        if(buscarExperiencia_laboral(id)!=null){
            exp.setId(id);
            expRep.save(exp);
        }
    }

    @Override
    public void borrarExperiencia_laboral(Long id) {
        expRep.deleteById(id);
    }

    @Override
    public List<Experiencia_laboral> verExperiencias_laborales() {
        return expRep.findAll();
    }

   
}
