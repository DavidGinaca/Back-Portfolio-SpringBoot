/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.model;

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
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    
    private String descripcion;
    
    
    public AcercaDe(){}
    
    public AcercaDe(long id, String descripcion){
        this.id=id;
        this.descripcion= descripcion;
    }
    
}

