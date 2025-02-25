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
    public Producto getProductoById(Long codigo_producto) {
        return productoRepository.findById(codigo_producto).orElse(null);
    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        productoRepository.deleteById(codigo_producto);
    }

    @Override
    public void editProducto(Long codigo_producto, String nuevoNombre, String nuevaMarca, Double nuevoCosto, Double nuevaCantidadDisponible) {
        Producto producto = this.getProductoById(codigo_producto);
        producto.setNombre(nuevoNombre);
        producto.setMarca(nuevaMarca);
        producto.setCosto(nuevoCosto);
        producto.setCantidad_disponible(nuevaCantidadDisponible);
    }
}
