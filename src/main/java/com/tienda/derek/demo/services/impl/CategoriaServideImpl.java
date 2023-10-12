package com.tienda.derek.demo.services.impl;

import com.tienda.derek.demo.dao.CategoriaDao;
import com.tienda.derek.demo.domain.Categoria;
import com.tienda.derek.demo.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServideImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}