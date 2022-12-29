/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.Controller;



import com.portfolioBackEnd.portfolioBackEnd.model.persona;
import com.portfolioBackEnd.portfolioBackEnd.service.IpersonaService;
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
public class personaController {
    
         @Autowired
    
    private IpersonaService ipersonaService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/new")
    public void crearPersona(@RequestBody persona pers){
        ipersonaService.crearPersona(pers);       
    }

    
    @GetMapping("/persona/ver")
    @ResponseBody
    public List<persona>verPersona(){
        return ipersonaService.verPersona();
    }
  
       
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable long id){
    ipersonaService.borrarPersona(id);
    }

    
}
