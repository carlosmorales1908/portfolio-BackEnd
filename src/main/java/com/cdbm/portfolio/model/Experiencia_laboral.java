package com.cdbm.portfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia_laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String descripcion;
    private boolean esActual;
    
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    


    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String empresa, String descripcion, boolean esActual, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.esActual = esActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    
    
    
    
    
    
    
    
    
}
