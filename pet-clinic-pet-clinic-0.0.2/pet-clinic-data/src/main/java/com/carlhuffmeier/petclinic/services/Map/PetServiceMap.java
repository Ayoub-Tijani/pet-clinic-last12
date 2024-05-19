package com.carlhuffmeier.petclinic.services.Map;

import com.carlhuffmeier.petclinic.models.Owner;
import com.carlhuffmeier.petclinic.models.Pet;
import com.carlhuffmeier.petclinic.services.CrudServices;

import java.util.Set;

public class PetServiceMap extends abstractServiceMap<Pet,Long> implements CrudServices<Pet,Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet Object) {
        return super.save(Object.getId(),Object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
