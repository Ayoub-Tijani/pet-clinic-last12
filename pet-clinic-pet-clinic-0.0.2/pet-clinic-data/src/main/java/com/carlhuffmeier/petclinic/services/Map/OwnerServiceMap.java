package com.carlhuffmeier.petclinic.services.Map;

import com.carlhuffmeier.petclinic.models.Owner;
import com.carlhuffmeier.petclinic.services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends abstractServiceMap<Owner,Long> implements CrudServices<Owner,Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner Object) {
        return super.save(Object.getId(),Object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
