package com.carlhuffmeier.petclinic.services;

import com.carlhuffmeier.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
