/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.derek.demo.services;

import com.tienda.derek.demo.domain.Categoria;
import java.util.List;

/**
 *
 * @author derek
 */
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
}
