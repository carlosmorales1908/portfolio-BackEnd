package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Educacion;
import com.cdbm.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository eduRepo;

  
    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Long id, Educacion edu){
        if(buscarEducacion(id)!=null){
            edu.setId(id);
            eduRepo.save(edu);
        }
    }
    
    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public List<Educacion> verEducaciones() {
       return eduRepo.findAll();
    }

    
    
}
