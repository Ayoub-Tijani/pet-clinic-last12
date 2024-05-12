package com.carlhuffmeier.petclinic.services;

import com.carlhuffmeier.petclinic.models.Pet;
import com.carlhuffmeier.petclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();


}
