/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.Controller;

import com.portfolioBackEnd.portfolioBackEnd.model.educacion;
import com.portfolioBackEnd.portfolioBackEnd.service.IeducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david
 */

@RestController
public class educacionController {
    
     @Autowired
    
    private IeducacionService eduRepo;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody educacion edu ){
    eduRepo.crearEducacion(edu);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody               /*devuelve en formato json*/
    public List<educacion> verEducacion(){
        return eduRepo.verEducacion();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/educacion/{id}")   
    public void borrarEducacion(@PathVariable long id){
       eduRepo.borrarEducacion(id);
    }
    
}
