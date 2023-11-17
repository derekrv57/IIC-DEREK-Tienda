/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.derek.demo.dao;

import com.tienda.derek.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author derek
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username);
}
