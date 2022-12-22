
package com.portfolioBackEnd.portfolioBackEnd.service;

import com.portfolioBackEnd.portfolioBackEnd.model.expLaboral;
import java.util.List;

/**
 *
 * @author david
 */
public interface IexpLaboralService {
    
    
    public List<expLaboral> verExpLaboral();
    public void crearExpLaboral(expLaboral expLab);
    public void borrarExpLaboral(Long id);
    public expLaboral buscarExpLaboral (Long id);
    
}
