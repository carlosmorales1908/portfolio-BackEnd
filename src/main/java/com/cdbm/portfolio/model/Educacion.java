package com.cdbm.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String institucion;
    private String nivel;
    private String titulo;
    private boolean enCurso;
    private int anioFinalizado;
    
    

    public Educacion() {
    }

    
    public Educacion(Long id, String institucion, String nivel, String titulo, boolean enCurso, int anioFinalizado) {
        this.id = id;
        this.institucion = institucion;
        this.nivel = nivel;
        this.titulo = titulo;
        this.enCurso = enCurso;
        this.anioFinalizado = anioFinalizado;
    }
    

    
}
