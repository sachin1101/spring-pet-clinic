package com.spring5.springpetclinic.model;

import java.time.LocalDate;

public class Pet extends  BaseEntity {


    public enum PET_TYPE {
        CAT,
        DOG,
        RABBIT,
        TURTLE,
        ANIMAL
    };



    private PET_TYPE petType =PET_TYPE.ANIMAL;
    private Owner owner;

    private LocalDate birthDate;
    private String name;


    public PET_TYPE getPetType() {
        return petType;
    }

    public void setPetType(PET_TYPE petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
