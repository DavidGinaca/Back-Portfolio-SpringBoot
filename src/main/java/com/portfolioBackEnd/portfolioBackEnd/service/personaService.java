/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.persona;
import com.portfolioBackEnd.portfolioBackEnd.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class personaService implements IpersonaService {

    @Autowired
    public personaRepository perso;

    @Override
    public List<persona> verPersona() {
       return perso.findAll();
    }

    @Override
    public void crearPersona(persona pers) {
        perso.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
     perso.deleteById(id);
    }

    @Override
    public persona buscarPersona(Long id) {
    return perso.findById(id).orElse(null);
    }
    
}
