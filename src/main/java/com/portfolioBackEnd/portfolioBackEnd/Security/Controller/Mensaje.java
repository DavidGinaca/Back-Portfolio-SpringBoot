/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.Security.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
    private String mensaje;

    //constuctor vacio
    public Mensaje() {
    }
    //constructor con parametros
    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   

    
    
}