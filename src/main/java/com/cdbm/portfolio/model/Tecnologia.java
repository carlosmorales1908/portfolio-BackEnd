package com.cdbm.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private int meses;  //tiempo de manejo de la tecnologia
    private int porcentaje;
    private String colorCirculo;
    private String colorPorcentaje;
    private String url_img;

    
    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, int meses, String colorCirculo, String colorPorcentaje, String url_img) {
        this.id = id;
        this.nombre = nombre;
        this.meses = meses;
        this.colorCirculo = colorCirculo;
        this.colorPorcentaje = colorPorcentaje;
        this.url_img = url_img;
    }

    

   
    
    
    
    
}
