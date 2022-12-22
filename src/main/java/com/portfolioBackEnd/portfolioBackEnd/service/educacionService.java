package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.educacion;
import com.portfolioBackEnd.portfolioBackEnd.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */

@Service
public class educacionService implements IeducacionService{

    
     @Autowired
    public educacionRepository eduRepo;
     
    @Override
    public List<educacion> verEducacion() {
      return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(educacion edu) {
      eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
    
}
