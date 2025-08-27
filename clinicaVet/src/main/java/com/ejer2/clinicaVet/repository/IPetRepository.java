package com.ejer2.clinicaVet.repository;

import com.ejer2.clinicaVet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {
}
