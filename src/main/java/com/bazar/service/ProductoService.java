package com.bazar.service;

import com.bazar.model.Producto;
import com.bazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void postProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> getAllProducto() {
        return productoRepository.findAll();
    }

    @Override
    public Producto getProductoById(Long codigoProducto) {
        return productoRepository.findById(codigoProducto).orElse(null);
    }

    @Override
    public void deleteProducto(Long codigoProducto) {
        productoRepository.deleteById(codigoProducto);
    }

    @Override
    public void editProducto(Long codigoProducto, String nuevoNombre, String nuevaMarca, Double nuevoCosto, Double nuevaCantidadDisponible) {
        Producto producto = this.getProductoById(codigoProducto);
        producto.setNombre(nuevoNombre);
        producto.setMarca(nuevaMarca);
        producto.setCosto(nuevoCosto);
        producto.setCantidad_disponible(nuevaCantidadDisponible);
    }
}
