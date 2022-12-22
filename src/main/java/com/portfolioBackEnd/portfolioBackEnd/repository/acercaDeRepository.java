
package com.portfolioBackEnd.portfolioBackEnd.repository;

import com.portfolioBackEnd.portfolioBackEnd.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author david
 */

@Repository
public interface acercaDeRepository extends JpaRepository <AcercaDe, Long> {
    
    
}
