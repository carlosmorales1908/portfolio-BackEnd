package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    
    public void crearEducacion(Educacion edu);
    public Educacion buscarEducacion(Long id);
    public void modificarEducacion(Long id, Educacion edu);
    public void borrarEducacion(Long id);
    public List<Educacion> verEducaciones();
    
}
