package com.spring5.springpetclinic.services;


import com.spring5.springpetclinic.model.Owner;

import java.lang.management.LockInfo;
import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);
}
