package com.ejer2.clinicaVet.controller;

import com.ejer2.clinicaVet.dto.PetOwnerDTO;
import com.ejer2.clinicaVet.model.Pet;
import com.ejer2.clinicaVet.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private IPetService petService;

    @GetMapping("/pets")
    public List<Pet> getPets(){
        return petService.getPets();
    }

    @GetMapping ("/pet/getSpecies")
    public List<Pet> getPetsSpecies(@RequestParam String species){
        return petService.getPetsSpecies(species);
    }

    @GetMapping ("/pet")
    public Pet getPet(@RequestParam Long id){
       return petService.getPet(id);
    }

    @PostMapping("/pet/save")
    public String savePet(@RequestBody Pet pet){
        petService.savePet(pet);
        return "the pet was successfully created";
    }

    @DeleteMapping ("/pet/delete")
    public String deletePet(@RequestParam Long id){
        petService.deletePet(id);
        return "the pet was successfully deleted";
    }

    @PutMapping ("/pet/edit")
    public Pet editPet(@RequestBody Pet pet){
        petService.editPet(pet);
        return petService.getPet(pet.getId_pet());
    }

    @GetMapping ("/getInfo")
    public PetOwnerDTO getInfo(@RequestParam Long id){
        PetOwnerDTO petDto = petService.getDTO(id);
        return  petDto;
    }
}
