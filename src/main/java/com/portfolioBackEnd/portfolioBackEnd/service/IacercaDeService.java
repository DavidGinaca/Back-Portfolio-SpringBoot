
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.AcercaDe;
import java.util.List;

/**
 *
 * @author david
 */
public interface IacercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    public void crearAcercaDe(AcercaDe acerq);
    public void borrarAcercaDe(Long id);
    public AcercaDe buscarAcercade(Long id);
    
}
