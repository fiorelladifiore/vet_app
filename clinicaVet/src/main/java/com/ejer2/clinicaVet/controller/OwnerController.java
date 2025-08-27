package com.ejer2.clinicaVet.controller;

import com.ejer2.clinicaVet.model.Owner;
import com.ejer2.clinicaVet.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private IOwnerService ownerServi;

    @GetMapping ("/owners")
    public List<Owner> getOwners(){
        return ownerServi.getOwners();
    }

    @GetMapping ("/owner")
    public Owner getOwner(@RequestParam Long id){
        return ownerServi.getOwner(id);
    }

    @PostMapping ("/owner/save")
    public String saveOwner(@RequestBody Owner owner){
        ownerServi.saveOwner(owner);
        return "the owner was successfully created";
    }

    @DeleteMapping ("/owner/delete")
    public String deleteOwner(@RequestParam Long id){
        ownerServi.deleteOwner(id);
        return "the owner was successfully deleted";
    }

    @PutMapping ("/owner/edit")
    public Owner editOwner(@RequestBody Owner owner){
        ownerServi.editOwner(owner);
        return ownerServi.getOwner(owner.getId_owner());
    }
}
