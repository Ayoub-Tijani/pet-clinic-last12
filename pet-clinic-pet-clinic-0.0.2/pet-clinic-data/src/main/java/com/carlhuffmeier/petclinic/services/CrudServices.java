package com.carlhuffmeier.petclinic.services;

import java.util.Set;

//we create this generique interface to avoid the duplication of method
public interface CrudServices<T,ID> {

    T findById(ID id);

    T save(T Object);

    Set<T> findAll();

    void deleteById(ID id);

    void delete(T Object);
}
