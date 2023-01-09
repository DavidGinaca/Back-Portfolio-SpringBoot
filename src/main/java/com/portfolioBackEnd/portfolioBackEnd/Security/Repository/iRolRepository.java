/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.Security.Repository;

import com.portfolioBackEnd.portfolioBackEnd.Security.Entity.Rol;
import com.portfolioBackEnd.portfolioBackEnd.Security.Enums.RolNombre;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}