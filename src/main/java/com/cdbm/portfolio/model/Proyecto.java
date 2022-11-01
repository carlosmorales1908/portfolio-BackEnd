package com.cdbm.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private String url_img;
    private String link;
    
   
    


    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String url_img, String link) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_img = url_img;
        this.link = link;
    }    
    
}
