package com.ejer2.clinicaVet.service;

import com.ejer2.clinicaVet.dto.PetOwnerDTO;
import com.ejer2.clinicaVet.model.Pet;
import com.ejer2.clinicaVet.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService implements  IPetService{

    @Autowired
    private IPetRepository petRepo;

    @Override
    public List<Pet> getPets() {
        List<Pet> petList = petRepo.findAll();
        return  petList;
    }

    @Override
    public Pet getPet(Long id) {
        Pet pet = petRepo.findById(id).orElse(null);
        return pet;
    }

    @Override
    public void savePet(Pet pet) {
        petRepo.save(pet);
    }

    @Override
    public void deletePet(Long id) {
        petRepo.deleteById(id);
    }

    @Override
    public void editPet(Pet pet) {
            this.savePet(pet);
    }

    @Override
    public PetOwnerDTO getDTO(Long id) {
        PetOwnerDTO poDTO = new PetOwnerDTO();
        Pet pet = this.getPet(id);

        poDTO.setPetName(pet.getName());
        poDTO.setPetSpecies(pet.getSpecies());
        poDTO.setPetBreed(pet.getBreed());
        poDTO.setOwnerName(pet.getOwner().getName());
        poDTO.setOwnerLastName(pet.getOwner().getLastName());
        return poDTO;
    }

    @Override
    public List<Pet> getPetsSpecies(String species) {
        List<Pet> pets = petRepo.findAll();
        List<Pet> petSpecies = new ArrayList<>();

        for (Pet pet : pets) {
            if(pet.getSpecies().equals(species)){
                petSpecies.add(pet);
            }
        }

        return petSpecies;
    }

}
