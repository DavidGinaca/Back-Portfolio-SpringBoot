/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.Security.Service;

import com.portfolioBackEnd.portfolioBackEnd.Security.Entity.Usuario;
import com.portfolioBackEnd.portfolioBackEnd.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */

@Service
public class UserDetailsImpl implements UserDetailsService {
    
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
    
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
    
    
    
}
