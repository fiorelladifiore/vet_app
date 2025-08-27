package com.ejer2.clinicaVet.service;

import com.ejer2.clinicaVet.model.Owner;
import com.ejer2.clinicaVet.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IOwnerService {

    public List<Owner> getOwners();

    public Owner getOwner(Long id);

    public void saveOwner(Owner ow);

    public void deleteOwner(Long id);

    public void editOwner(Owner ow);
}
