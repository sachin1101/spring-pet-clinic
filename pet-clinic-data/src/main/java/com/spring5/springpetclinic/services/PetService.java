package com.spring5.springpetclinic.services;

import com.spring5.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
