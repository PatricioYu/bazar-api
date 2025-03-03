package com.bazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (nullable = false)
    private String name;
    private String brand;
    @Column (nullable = false)
    private Double price;
    private Double units_in_stock;

    protected Product() {
    }

    public Product(Long id, String name, String brand, Double price, Double units_in_stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.units_in_stock = units_in_stock;
    }
}
