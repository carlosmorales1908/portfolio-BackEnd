package com.cdbm.portfolio.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String url_img;

    
    @OneToMany
    List<Educacion> listaEducaciones;
    @OneToMany
    List<Experiencia_laboral> listaExperiencias_laborales;
    @OneToMany
    List<Proyecto> listaProyectos;
    @OneToMany
    List<Tecnologia> listaTecnologias;

    
    public Persona(){
    }

    public Persona(Long id, String nombre, String apellido, String correo, String sobre_mi, String url_foto, String url_img, List<Educacion> listaEducaciones, List<Experiencia_laboral> listaExperiencias_laborales, List<Proyecto> listaProyectos, List<Tecnologia> listaTecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_img = url_img;
        this.listaEducaciones = listaEducaciones;
        this.listaExperiencias_laborales = listaExperiencias_laborales;
        this.listaProyectos = listaProyectos;
        this.listaTecnologias = listaTecnologias;
    }
   
}
