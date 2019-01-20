package com.spring5.springpetclinic.bootstrap;

import com.spring5.springpetclinic.model.*;
import com.spring5.springpetclinic.services.OwnerService;
import com.spring5.springpetclinic.services.PetTypeService;
import com.spring5.springpetclinic.services.SpecialityService;
import com.spring5.springpetclinic.services.VetService;
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
    private SpecialityService specialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {


        int count =vetService.findAll().size();

        if(count==0)
        {
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");

        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();


        owner1.setId(1L);
        owner1.setFirstName("Lauren");
        owner1.setLastName("Marget");
        owner1.setStreet("1223 Speed Ln");
        owner1.setCity("Allentown");
        owner1.setTelphone("4648624112");


        Pet[] petArray = {new Pet(), new Pet()};

        petArray[0].setPetType(savedDogPetType);
        petArray[0].setBirthDate(LocalDate.now());
        petArray[0].setOwner(owner1);
        petArray[0].setName("Tommy");

        petArray[1].setPetType(savedCatPetType);
        petArray[1].setBirthDate(LocalDate.now());
        petArray[1].setOwner(owner1);
        petArray[1].setName("Katty");

        petArray[0].setOwner(owner1);
        petArray[1].setOwner(owner1);

        owner1.setPets(new HashSet<Pet>(Arrays.asList(petArray)));
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

        Speciality[] specialities = { new Speciality("Dermatology"), new Speciality("Dentistry")};


        Speciality[] savedSpecialities = { specialitiesService.save(specialities[0]),specialitiesService.save(specialities[1])};


        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("Kelly");
        vet1.setLastName("Casey");
        vet1.setSpecialities(new HashSet<Speciality>(Arrays.asList(savedSpecialities)));

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setId(2L);
        vet2.setFirstName("Caley");
        vet2.setLastName("Anthony");

        vet2.setSpecialities(new HashSet<Speciality>(Arrays.asList(savedSpecialities)));
        vetService.save(vet2);

        System.out.println("Loaded Vets... " + vetService.findAll().stream().count());
    }
}
