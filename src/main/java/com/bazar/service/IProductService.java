package com.bazar.service;

import com.bazar.model.Product;

import java.util.List;

public interface IProductService {
    public void postProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public void deleteProduct(Long id);
    public void editProduct(Long id, String newName, String newBrand, Double newPrice, Integer newUnitsInStock);
}
