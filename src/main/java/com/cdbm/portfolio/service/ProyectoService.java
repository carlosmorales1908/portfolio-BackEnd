package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Proyecto;
import com.cdbm.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyectRepo;
    
    @Override
    public void crearProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Long id, Proyecto proyect) {
        if(buscarProyecto(id)!=null){
            proyect.setId(id);
            proyectRepo.save(proyect);
        }
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public List<Proyecto> verProyectos() {
        return proyectRepo.findAll();
    }
    
}
