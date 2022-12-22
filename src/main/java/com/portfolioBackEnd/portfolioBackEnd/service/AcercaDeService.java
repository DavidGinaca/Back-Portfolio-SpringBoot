package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.AcercaDe;
import com.portfolioBackEnd.portfolioBackEnd.repository.acercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */

@Service
public class AcercaDeService implements IacercaDeService {

    @Autowired
    public acercaDeRepository acerqRepo;
    
    @Override
    public List<AcercaDe> verAcercaDe() {
    
        return acerqRepo.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe acerq) {
        acerqRepo.save(acerq);
    }

    @Override
    public void borrarAcercaDe(Long id) {
       acerqRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercade(Long id) {
        return acerqRepo.findById(id).orElse(null);
    }
    
}
