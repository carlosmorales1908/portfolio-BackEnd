package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    
    public void crearTecnologia(Tecnologia tec);
    public Tecnologia buscarTecnologia(Long id);
    public void modificarTecnologia(Long id, Tecnologia tec);
    public void borrarTecnologia(Long id);
    public List<Tecnologia> verTecnologias();
    
}
