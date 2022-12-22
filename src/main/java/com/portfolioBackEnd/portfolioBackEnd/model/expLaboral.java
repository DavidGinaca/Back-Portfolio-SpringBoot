package com.portfolioBackEnd.portfolioBackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author david
 */

@Getter @Setter
@Entity
public class expLaboral {
    
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO )
    @Column (unique= true, nullable=false) 
    private long id;
    
    
    private String lugar;
    private String desde;
    private String hasta;
    private String decripcion;

    public expLaboral() {
    }

    public expLaboral(long id, String lugar, String desde, String hasta, String decripcion) {
        this.id = id;
        this.lugar = lugar;
        this.desde = desde;
        this.hasta = hasta;
        this.decripcion = decripcion;
    }
    
    
    
}
