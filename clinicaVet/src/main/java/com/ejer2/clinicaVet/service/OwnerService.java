package com.ejer2.clinicaVet.service;

import com.ejer2.clinicaVet.model.Owner;
import com.ejer2.clinicaVet.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService{

    @Autowired
    private IOwnerRepository ownerRepo;

    @Override
    public List<Owner> getOwners() {
        List<Owner> ownerList = ownerRepo.findAll();
        return ownerList;
    }

    @Override
    public Owner getOwner(Long id) {
        Owner ow = ownerRepo.findById(id).orElse(null);
        return  ow;
    }

    @Override
    public void saveOwner(Owner ow) {
        ownerRepo.save(ow);
    }

    @Override
    public void deleteOwner(Long id) {
        ownerRepo.deleteById(id);

    }

    @Override
    public void editOwner(Owner ow) {
        this.saveOwner(ow);

    }
}
