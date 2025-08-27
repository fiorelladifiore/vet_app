package com.ejer2.clinicaVet.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PetOwnerDTO {

    private String petName;
    private String petSpecies;
    private String petBreed;
    private String ownerName;
    private String ownerLastName;

    public PetOwnerDTO() {
    }

    public PetOwnerDTO(String petName, String petSpecies, String petBreed, String ownerName, String ownerLastName) {
        this.petName = petName;
        this.petSpecies = petSpecies;
        this.petBreed = petBreed;
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
    }
}
