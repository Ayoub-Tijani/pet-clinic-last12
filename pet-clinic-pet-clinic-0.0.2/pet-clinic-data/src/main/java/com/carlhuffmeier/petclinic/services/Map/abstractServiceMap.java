package com.carlhuffmeier.petclinic.services.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class abstractServiceMap<T,ID> {

    Map<ID,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    };

    T findById(ID id){
        return map.get(id);
    };

    T save(ID id,T object){
        map.put(id,object);
        return object;
    };

    void deleteById(ID id){
        map.remove(id);
    };

    void delete(T object){
        //this is how can delete object from a hashMap
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    };



}
