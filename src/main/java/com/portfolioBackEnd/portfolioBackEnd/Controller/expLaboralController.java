package com.portfolioBackEnd.portfolioBackEnd.Controller;

import com.portfolioBackEnd.portfolioBackEnd.model.expLaboral;
import com.portfolioBackEnd.portfolioBackEnd.service.IexpLaboralService;
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
public class expLaboralController {
    @Autowired
    
    private IexpLaboralService expServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/expLab")
    public void agregarexpLaboral (@RequestBody expLaboral expLab ){
    expServ.crearExpLaboral(expLab);
    }
    
    @GetMapping("/ver/expLab")
    @ResponseBody               /*devuelve en formato json*/
    public List<expLaboral> verExpLaboral(){
        return expServ.verExpLaboral();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/expLab/{id}")   
    public void borrarExpLaboral(@PathVariable long id){
       expServ.borrarExpLaboral(id);
    }
    
}
