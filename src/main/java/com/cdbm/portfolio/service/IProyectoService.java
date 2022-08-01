package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public void crearProyecto(Proyecto proyect);
    public Proyecto buscarProyecto(Long id);
    public void modificarProyecto(Long id, Proyecto proyect);
    public void borrarProyecto(Long id);
    public List<Proyecto> verProyectos();
    
}
