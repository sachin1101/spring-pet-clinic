package com.spring5.springpetclinic.services;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.model.Pet;
import com.spring5.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();


}
