package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    
    public void crearPersona(Persona per);
    public Persona buscarPersona(Long id);
    public void modificarPersona(Long id, Persona per);
    public void borrarPersona(Long id);
    public List<Persona> verPersonas();
    
    
}
