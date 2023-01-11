/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author david
 */

@Getter @Setter
public class dtoPersona {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;

    private String img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }
    
}
