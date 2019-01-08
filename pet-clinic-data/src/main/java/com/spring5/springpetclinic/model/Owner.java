package com.spring5.springpetclinic.model;

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pets;
    private String street;
    private String city;
    private String telphone;


    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
