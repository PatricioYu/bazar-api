package com.bazar.controller;

import com.bazar.model.Product;
import com.bazar.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final IProductService intProdService;

    public ProductController(IProductService intProdService) {
        this.intProdService = intProdService;
    }

    @PostMapping(path = "/products")
    public void postProduct(@RequestBody Product product) {
        intProdService.postProduct(product);
    }

    @GetMapping(path = "/products")
    public List<Product> getAllProducts() {
        return intProdService.getAllProducts();
    }

    @GetMapping(path = "/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return intProdService.getProductById(id);
    }

    @DeleteMapping(path = "/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        intProdService.deleteProduct(id);
    }

    @PutMapping(path = "/products/{id}")
    public void updateProduct(
            @PathVariable Long id,
            @RequestParam(required = false, name = "name") String newName,
            @RequestParam(required = false, name = "brand") String newBrand,
            @RequestParam(required = false, name = "price") Double newPrice,
            @RequestParam(required = false, name = "unitsInStock") Double newUnitsInStock) {
        intProdService.editProduct(id, newName, newBrand, newPrice, newUnitsInStock);
    }
}
