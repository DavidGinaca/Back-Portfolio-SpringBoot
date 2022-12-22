
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.expLaboral;
import com.portfolioBackEnd.portfolioBackEnd.repository.expLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */


@Service
public class expLaboralService implements IexpLaboralService {

    @Autowired
    public expLaboralRepository expRepo;
    
    @Override
    public List<expLaboral> verExpLaboral() {
        return expRepo.findAll();
    }

    @Override
    public void crearExpLaboral(expLaboral expLab) {
        expRepo.save(expLab);
    }

    @Override
    public void borrarExpLaboral(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public expLaboral buscarExpLaboral(Long id) {
       return expRepo.findById(id).orElse(null);
    }
    
}
