package com.bazar.service;

import com.bazar.model.Producto;

import java.util.List;

public interface IProductoService {
    public void postProducto(Producto producto);
    public List<Producto> getAllProducto();
    public Producto getProductoById(Long codigoProducto);
    public void deleteProducto(Long codigoProducto);
    public void editProducto(Long codigoProducto, String nuevoNombre, String nuevaMarca, Double nuevoCosto, Double nuevaCantidadDisponible);
}
