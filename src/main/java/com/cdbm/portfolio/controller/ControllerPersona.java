package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.service.IPersonaService;
import com.cdbm.portfolio.model.Persona;
import com.cdbm.portfolio.security.controller.Mensaje;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerPersona {
    
    @Autowired
    private IPersonaService persServ;
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public ResponseEntity<?> agregarPersona(@RequestBody Persona pers){
        if(StringUtils.isBlank(pers.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(pers.getApellido())){
            return new ResponseEntity(new Mensaje("El apellido es obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if(persServ.existeCorreo(pers.getCorreo())){
            return new ResponseEntity(new Mensaje("El correo ya ha sido registrado."), HttpStatus.BAD_REQUEST);
        }
        
        persServ.crearPersona(pers);
        return new ResponseEntity(new Mensaje("Persona agregada."), HttpStatus.OK);
    }
    
    
    @GetMapping("/ver/{id}")
    public ResponseEntity<?> verPersona(@PathVariable Long id){
        if(persServ.buscarPersona(id)==null){
            return new ResponseEntity(new Mensaje("La persona no existe."), HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity(persServ.buscarPersona(id), HttpStatus.OK);
        }
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> modificarPersona(@PathVariable Long id,
                                              @RequestBody Persona pers){
        if(persServ.buscarPersona(id)==null){
            return new ResponseEntity(new Mensaje("La persona no existe."), HttpStatus.BAD_REQUEST);
        }
        else{
            persServ.modificarPersona(id, pers);
            return new ResponseEntity(new Mensaje("Los cambios han sido guardados."), HttpStatus.OK);
        }
    }
 
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> borrarPersona(@PathVariable Long id){
        if(persServ.buscarPersona(id)==null){
            return new ResponseEntity(new Mensaje("La persona no existe."), HttpStatus.BAD_REQUEST);
        }
        else{
            persServ.borrarPersona(id);
            return new ResponseEntity(new Mensaje("La persona ha sido eliminada."), HttpStatus.OK);
        }
    }
    

    @GetMapping ("/ver/todas")
    @ResponseBody
    public ResponseEntity<List<Persona>> verPersonas(){
        return new ResponseEntity(persServ.verPersonas(), HttpStatus.OK);
    }
        
    
}
