package com.bazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String surname;
    private String dni;

    @OneToMany
    private List<Sale> sales_list;

    protected Client() {
    }

    public Client(Long id, String name, String surname, String dni) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
}
