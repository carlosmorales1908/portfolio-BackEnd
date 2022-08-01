
package com.cdbm.portfolio.service;

import com.cdbm.portfolio.model.Experiencia_laboral;
import java.util.List;


public interface IExperiencia_laboral {
    
   
    public void crearExperiencia_laboral(Experiencia_laboral exp);
    public Experiencia_laboral buscarExperiencia_laboral(Long id);
    public void modificarExperiencia_laboral(Long id, Experiencia_laboral exp);
    public void borrarExperiencia_laboral(Long id);
    public List<Experiencia_laboral> verExperiencias_laborales();
    
}
