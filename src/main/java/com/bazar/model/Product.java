package com.bazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

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
    private Integer units_in_stock;

//    @Version
//    private Integer version;

    protected Product() {
    }

    public Product(String name, String brand, Double price, Integer units_in_stock) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.units_in_stock = units_in_stock;
    }
}
