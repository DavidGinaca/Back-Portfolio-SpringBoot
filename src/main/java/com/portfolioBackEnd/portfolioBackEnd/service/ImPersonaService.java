/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.Persona;
import com.portfolioBackEnd.portfolioBackEnd.repository.IpersonaRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
@Transactional
public class ImPersonaService {
    
    @Autowired IpersonaRepo ipersonarepo;
    
    public List<Persona> list(){
         return ipersonarepo.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return ipersonarepo.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return ipersonarepo.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         ipersonarepo.save(persona);
     }
     
     public void delete(int id){
         ipersonarepo.deleteById(id);
     }
     
     public boolean existsById(int id){
         return ipersonarepo.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return ipersonarepo.existsByNombre(nombre);
     }
    
}
