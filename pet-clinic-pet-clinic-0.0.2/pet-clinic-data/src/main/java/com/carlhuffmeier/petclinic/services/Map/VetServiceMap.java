package com.carlhuffmeier.petclinic.services.Map;

import com.carlhuffmeier.petclinic.models.Pet;
import com.carlhuffmeier.petclinic.models.Vet;
import com.carlhuffmeier.petclinic.services.CrudServices;

import java.util.Set;

public class VetServiceMap extends abstractServiceMap<Vet,Long> implements CrudServices<Vet,Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet Object) {
        return super.save(Object.getId(),Object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
