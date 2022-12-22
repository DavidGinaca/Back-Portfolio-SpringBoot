package com.portfolioBackEnd.portfolioBackEnd.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolioBackEnd.portfolioBackEnd.model.AcercaDe;
import com.portfolioBackEnd.portfolioBackEnd.service.IacercaDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author David Ginaca
 */

@RestController 
public class AcercaDeMiController {
    
    @Autowired 
    
    private IacercaDeService AcerqServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/AcercaDe")
    public void AgregarAcercaDe(@RequestBody AcercaDe acerq){
    AcerqServ.crearAcercaDe(acerq);
    }
    
    @GetMapping("/ver/AcercaDe")
    @ResponseBody               /*devuelve en formato json*/
    public List<AcercaDe> verAcercaDe(){
        return AcerqServ.verAcercaDe();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/acercaDe/{id}")   
    public void borrarAcercaDe(@PathVariable long id){
        AcerqServ.borrarAcercaDe(id);
    }
}
