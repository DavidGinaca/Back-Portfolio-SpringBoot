/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.educacion;
import java.util.List;

/**
 *
 * @author david
 */
public interface IeducacionService {
    
        public List<educacion> verEducacion();
    public void crearEducacion (educacion edu);
    public void borrarEducacion (Long id);
    public educacion buscarEducacion (Long id);
    
    
}
