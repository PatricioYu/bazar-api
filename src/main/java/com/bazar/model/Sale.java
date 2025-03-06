package com.bazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter @Entity
public class Sale {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (nullable = false)
    private LocalDate sales_date;
    @Column (nullable = false)
    private Double total;
    @Column (nullable = false)
    @OneToMany
    @JoinColumn(name = "id")
    private List<Product> products_list;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Sale() {}

    public Sale(Long id, LocalDate sales_date, Double total, List<Product> products_list, Client client) {
        this.id = id;
        this.sales_date = sales_date;
        this.total = total;
        this.products_list = products_list;
        this.client = client;
    }
}
