package com.bazar.controller;

import com.bazar.model.Producto;
import com.bazar.service.IProductoService;
import com.bazar.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService intProdService;

    @PostMapping(path = "/productos")
    public void postProduct(@RequestBody Producto producto) {
        intProdService.postProducto(producto);
    }

    @GetMapping(path = "/productos")
    public List<Producto> getAllProductos() {
        return intProdService.getAllProducto();
    }

    @GetMapping(path = "/productos/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return intProdService.getProductoById(id);
    }

    @DeleteMapping(path = "/productos/{id}")
    public void deleteProductoById(@PathVariable Long id) {
        intProdService.deleteProducto(id);
    }

    @PutMapping(path = "/productos/{id}")
    public void updateProducto(
            @PathVariable Long id,
            @RequestParam(required = false, name = "nombre") String nuevoNombre,
            @RequestParam(required = false, name = "marca") String nuevaMarca,
            @RequestParam(required = false, name = "costo") Double nuevoCosto,
            @RequestParam(required = false, name = "cantidad-disponible") Double nuevaCantidadDisponible) {
        intProdService.editProducto(id, nuevoNombre, nuevaMarca, nuevoCosto, nuevaCantidadDisponible);
    }
}
