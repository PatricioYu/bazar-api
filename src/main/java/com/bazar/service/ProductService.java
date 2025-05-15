package com.bazar.service;

import com.bazar.model.Product;
import com.bazar.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void postProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void editProduct(Long id, String newName, String newBrand, Double newPrice, Integer newUnitsInStock) {
        Product product = this.getProductById(id);
        product.setName(newName);
        product.setBrand(newBrand);
        product.setPrice(newPrice);
        product.setUnits_in_stock(newUnitsInStock);
    }
}
