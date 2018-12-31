package com.spring5.springpetclinic.services;


import com.spring5.springpetclinic.model.Owner;

import java.lang.management.LockInfo;
import java.util.Set;

public interface OwnerService  {

    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
