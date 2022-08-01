package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.service.IPersonaService;
import com.cdbm.portfolio.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class ControllerPersona {
    
    @Autowired
    private IPersonaService persServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/new")
    public void agregarPersona(@RequestBody Persona pers){
       persServ.crearPersona(pers);
        System.out.println(pers.getNombre());
        System.out.println(pers.getListaProyectos());
       
    }
    
    @GetMapping("/persona/ver/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persServ.buscarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/modificar/{id}")
    public void modificarPersona(@PathVariable Long id,
                                 @RequestBody Persona pers){
        persServ.modificarPersona(id, pers);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/eliminar/{id}")
    public void borrarPersona(@PathVariable Long id){
        persServ.borrarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/persona/ver/todas")
    @ResponseBody
    public List<Persona> verPersonas(){
         return persServ.verPersonas();
    }
    
    
}
