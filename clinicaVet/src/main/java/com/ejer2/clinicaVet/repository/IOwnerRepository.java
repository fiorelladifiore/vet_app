package com.ejer2.clinicaVet.repository;

import com.ejer2.clinicaVet.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Long> {
}
