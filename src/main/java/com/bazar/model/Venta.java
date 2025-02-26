package com.bazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter @Entity
public class Venta {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    @Column (nullable = false)
    private LocalDate fecha_venta;
    @Column (nullable = false)
    private Double total;
    @Column (nullable = false)
    private List<Producto> listaProductos;

    @OneToOne
    @JoinColumn(name = "cliente_id_cliente")
    private Cliente cliente;

    protected Venta() {
    }

    public Venta(Long codigo_venta, LocalDate fecha_venta, Double total, List<Producto> listaProductos, Cliente cliente) {
        this.codigo_venta = codigo_venta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.cliente = cliente;
    }
}
