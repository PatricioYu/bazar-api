package com.bazar.service;

import com.bazar.model.Producto;

import java.util.List;

public interface IProductoService {
    public void postProducto(Producto producto);
    public List<Producto> getAllProducto();
    public Producto getProductoById(Long codigo_producto);
    public void deleteProducto(Long codigo_producto);
    public void editProducto(Long codigo_producto, String nombre, String marca, Double costo, Double cantidad_disponible);
}
