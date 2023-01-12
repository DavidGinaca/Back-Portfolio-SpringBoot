/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.portfolioBackEnd.portfolioBackEnd.model.Proyecto;

public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {

}