package com.tienda.derek.demo.services.impl;

import com.tienda.derek.demo.dao.ProductoDao;
import com.tienda.derek.demo.domain.Producto;
import com.tienda.derek.demo.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServideImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
        var lista=productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

}