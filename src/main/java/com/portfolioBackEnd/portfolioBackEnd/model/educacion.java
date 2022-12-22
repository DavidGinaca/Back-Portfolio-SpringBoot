
package com.portfolioBackEnd.portfolioBackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class educacion {
    
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO )
    @Column (unique= true, nullable=false) 
    private long id;
    
    private String titulo;
    private String establecimiento;
    private String descripcion;

    public educacion() {
    }

    public educacion(long id, String titulo, String establecimiento, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.establecimiento = establecimiento;
        this.descripcion = descripcion;
    }
    
    
}
