package com.spring5.springpetclinic.services;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.model.Pet;
import com.spring5.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService  extends CRUDService<Vet, Long>{

    Vet findByLastName(String lastName);
}
