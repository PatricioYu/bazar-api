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
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "sale_product",
            joinColumns = @JoinColumn(name = "sale_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products_list;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Version
    private Integer version;

    protected Sale() {}

    public Sale(LocalDate sales_date, Double total, List<Product> products_list, Client client) {
        this.sales_date = sales_date;
        this.total = total;
        this.products_list = products_list;
        this.client = client;
    }
}
