package com.spring5.springpetclinic.bootstrap;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.model.Pet;
import com.spring5.springpetclinic.model.PetType;
import com.spring5.springpetclinic.model.Vet;
import com.spring5.springpetclinic.services.OwnerService;
import com.spring5.springpetclinic.services.PetTypeService;
import com.spring5.springpetclinic.services.VetService;
import com.spring5.springpetclinic.services.mapbased.OwnerServiceMap;
import com.spring5.springpetclinic.services.mapbased.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;
    private PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {


        PetType dog = new PetType();
        dog.setName("dog");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");

        PetType savedCatPetType = petTypeService.save(dog);


        PetType [] petArr = {savedDogPetType, savedCatPetType};

        Owner owner1 = new Owner();




        owner1.setId(1L);
        owner1.setFirstName("Lauren");
        owner1.setLastName("Marget");
        owner1.setStreet("1223 Speed Ln");
        owner1.setCity("Allentown");
        owner1.setTelphone("4648624112");


        Pet [] tommy = {new Pet()};

        tommy[0].setPetType(Pet.PET_TYPE.DOG);
        tommy[0].setBirthDate(LocalDate.now());
        tommy[0].setOwner(owner1);


        owner1.setPets(new HashSet<Pet>(Arrays.asList(tommy)));
        this.ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setId(2L);
        owner2.setFirstName("Ashley");
        owner2.setLastName("Ramsen");

        owner2.setStreet("1405 Brick Dr");
        owner2.setCity("Allentown");
        owner2.setTelphone("4648624112");

        this.ownerService.save(owner2);

        System.out.println("Loaded Owners... " + ownerService.findAll().stream().count());
        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("Kelly");
        vet1.setLastName("Casey");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setId(2L);
        vet2.setFirstName("Caley");
        vet2.setLastName("Anthony");

        vetService.save(vet2);

        System.out.println("Loaded Vets... " + vetService.findAll().stream().count());

    }
}
