package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.model.Experiencia_laboral;
import com.cdbm.portfolio.service.IExperiencia_laboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerExperiencia_laboral {
    
    @Autowired
    private IExperiencia_laboral expServ;
    
    @PostMapping("/experiencia-laboral/new")
    public void crearExperiencia_laboral(@RequestBody Experiencia_laboral exp){
        expServ.crearExperiencia_laboral(exp);
    }
    
    @GetMapping("/experiencia-laboral/ver/{id}")
    public Experiencia_laboral verExperiencia_laboral(@PathVariable Long id){
        return expServ.buscarExperiencia_laboral(id);
    }
    
    @PutMapping("/experiencia-laboral/modificar/{id}")
    public void modificarExperiencia_laboral(@PathVariable Long id,
                                             @RequestBody Experiencia_laboral exp){
        expServ.modificarExperiencia_laboral(id, exp);
    }
    
    @DeleteMapping("/experiencia-laboral/eliminar/{id}")
    public void eliminarExperiencia_laboral(@PathVariable Long id){
        expServ.borrarExperiencia_laboral(id);
    }
    
    @GetMapping("/experiencia-laboral/ver/todas")
    @ResponseBody
    public List<Experiencia_laboral> verExperiencias_laborales(){
        return expServ.verExperiencias_laborales();
    }
    
}
