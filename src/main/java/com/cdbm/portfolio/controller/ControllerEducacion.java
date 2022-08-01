package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.model.Educacion;
import com.cdbm.portfolio.service.IEducacionService;
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
public class ControllerEducacion {
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping("/educacion/new")
    public void agregarEducacion(@RequestBody Educacion edu){
       eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/educacion/ver/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
    @PutMapping("/educacion/modificar/{id}")
    public void modificarEducacion(@PathVariable Long id,
                                   @RequestBody Educacion edu){
        eduServ.modificarEducacion(id, edu);
    }
    
    @DeleteMapping("/educacion/eliminar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @GetMapping ("/educacion/ver/todas")
    @ResponseBody
    public List<Educacion> verEducaciones(){
         return eduServ.verEducaciones();
    }
    
}
