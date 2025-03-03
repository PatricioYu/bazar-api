package com.bazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String surname;
    private String dni;

    protected Client() {
    }

    public Client(Long id, String name, String surname, String dni) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
}
