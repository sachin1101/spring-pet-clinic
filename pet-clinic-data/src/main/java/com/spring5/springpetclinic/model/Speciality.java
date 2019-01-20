package com.spring5.springpetclinic.model;

public class Speciality extends BaseEntity {

    private String name;

    public Speciality(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
