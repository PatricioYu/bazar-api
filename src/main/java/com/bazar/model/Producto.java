package com.bazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cantidad_disponible;

    protected Producto() {
    }

    public Producto(Long codigo_venta, String nombre, String marca, Double costo, Double cantidad_disponible) {
        this.codigo_venta = codigo_venta;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad_disponible = cantidad_disponible;
    }
}
