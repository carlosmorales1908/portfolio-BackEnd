package com.cdbm.portfolio.controller;

import com.cdbm.portfolio.model.Tecnologia;
import com.cdbm.portfolio.service.ITecnologiaService;
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
public class ControllerTecnologia {
    
    @Autowired
    private ITecnologiaService tecServ;
    
    @PostMapping("/tecnologia/new")
    public void crearTecnologia(@RequestBody Tecnologia tec){
        tecServ.crearTecnologia(tec);
    }
    
    @GetMapping("/tecnologia/ver/{id}")
    public Tecnologia buscarTecnologia(@PathVariable Long id){
        return tecServ.buscarTecnologia(id);
    }
    
    @PutMapping("/tecnologia/modificar/{id}")
    public void modificarTecnologia(@PathVariable Long id,
                                    @RequestBody Tecnologia tec){
        tecServ.modificarTecnologia(id, tec);
    }
    
    @DeleteMapping("/tecnologia/eliminar/{id}")
    public void borrarTecnologia(@PathVariable Long id){
        tecServ.borrarTecnologia(id);
    }
    
    @GetMapping("/tecnologia/ver/todas")
    @ResponseBody
    public List<Tecnologia> verTecnologias(){
        return tecServ.verTecnologias();
    }
    
    
}
