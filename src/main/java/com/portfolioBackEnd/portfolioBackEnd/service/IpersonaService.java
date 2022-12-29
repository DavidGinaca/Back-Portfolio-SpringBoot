/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.persona;
import java.util.List;

/**
 *
 * @author david
 */
public interface IpersonaService {
    
    public List<persona> verPersona();
    public void crearPersona (persona pers);
    public void borrarPersona(Long id);
    public persona buscarPersona(Long id);
    
}
