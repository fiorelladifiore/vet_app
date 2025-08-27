package com.ejer2.clinicaVet.service;

import com.ejer2.clinicaVet.dto.PetOwnerDTO;
import com.ejer2.clinicaVet.model.Pet;

import java.util.List;

public interface IPetService {

    public List<Pet> getPets();

    public Pet getPet(Long id);

    public void savePet(Pet pet);

    public void deletePet(Long id);

    public void editPet(Pet pet);

    public PetOwnerDTO getDTO(Long id);

    public List<Pet> getPetsSpecies(String species);

}
