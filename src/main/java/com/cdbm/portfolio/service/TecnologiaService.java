package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Tecnologia;
import com.cdbm.portfolio.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    public TecnologiaRepository tecRepo;
    
    
    @Override
    public void crearTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
        return tecRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTecnologia(Long id, Tecnologia tec) {
        if(buscarTecnologia(id)!=null){
            tec.setId(id);
            tecRepo.save(tec);
        }
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public List<Tecnologia> verTecnologias() {
        return tecRepo.findAll();
    }
    
}
