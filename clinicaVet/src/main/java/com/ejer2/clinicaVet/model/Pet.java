package com.ejer2.clinicaVet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pet;
    private String name;
    private String species;
    private String breed;
    private String color;
    @OneToOne
    @JoinColumn(name = "id_owner", referencedColumnName = "id_owner")
    private Owner owner;

    public Pet() {
    }

    public Pet(Long id_pet, String name, String species, String breed, String color) {
        this.id_pet = id_pet;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
    }
}
