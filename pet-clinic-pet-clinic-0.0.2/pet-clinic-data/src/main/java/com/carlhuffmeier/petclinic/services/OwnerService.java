package com.carlhuffmeier.petclinic.services;

import com.carlhuffmeier.petclinic.models.Owner;


public interface OwnerService extends CrudServices<Owner,Long>{

    Owner findByLastName(String lastName);


}
