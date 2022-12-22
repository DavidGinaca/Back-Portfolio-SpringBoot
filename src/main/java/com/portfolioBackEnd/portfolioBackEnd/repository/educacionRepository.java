/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.repository;

import com.portfolioBackEnd.portfolioBackEnd.model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author david
 */
public interface educacionRepository extends JpaRepository <educacion, Long> {
    
}
