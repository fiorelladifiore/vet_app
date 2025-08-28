package com.ejer2.clinicaVet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_owner;
    private String dni;
    private String name;
    private String lastName;
    private String phoneNumber;

    public Owner() {
    }

    public Owner(Long id_owner, String dni, String name, String lastName, String phoneNumber) {
        this.id_owner = id_owner;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
