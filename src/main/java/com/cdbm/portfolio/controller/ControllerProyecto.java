package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.model.Proyecto;
import com.cdbm.portfolio.service.IProyectoService;
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
@CrossOrigin(origins = "https://portfolio-frontend-aed6f.web.app/")
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService proyectServ;
    
    @PostMapping("/proyecto/new")
    public void crearProyecto(@RequestBody Proyecto proyect){
        proyectServ.crearProyecto(proyect);
    }
    
    @GetMapping("/proyecto/ver/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyectServ.buscarProyecto(id);
    }
    
    @PutMapping("/proyecto/modificar/{id}")
    public void modificarProyecto(@PathVariable Long id,
                                  @RequestBody Proyecto proyect){
        proyectServ.modificarProyecto(id, proyect);
    }
    
    @DeleteMapping("/proyecto/eliminar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectServ.borrarProyecto(id);
    }
    
    @GetMapping("/proyecto/ver/todos")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectServ.verProyectos();
    }
}
