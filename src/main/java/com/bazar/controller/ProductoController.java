package com.bazar.controller;

import com.bazar.model.Producto;
import com.bazar.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping(path = "/productos")
    public void postProduct(@RequestBody Producto producto) {
        productoService.postProducto(producto);
    }

    @GetMapping(path = "/productos")
    public List<Producto> getAllProductos() {
        return productoService.getAllProducto();
    }

    @GetMapping(path = "/productos/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }

    @DeleteMapping(path = "/productos/{id}")
    public void deleteProductoById(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }

    @PutMapping(path = "/productos")
    public void updateProducto() {

    }
}
