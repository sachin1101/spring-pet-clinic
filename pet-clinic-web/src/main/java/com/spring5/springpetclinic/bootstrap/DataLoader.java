package com.spring5.springpetclinic.bootstrap;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.model.Vet;
import com.spring5.springpetclinic.services.OwnerService;
import com.spring5.springpetclinic.services.VetService;
import com.spring5.springpetclinic.services.mapbased.OwnerServiceMap;
import com.spring5.springpetclinic.services.mapbased.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setId(1L);
        owner1.setFirstName("Lauren");
        owner1.setLastName("Marget");

        this.ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setId(2L);
        owner2.setFirstName("Ashley");
        owner2.setLastName("Ramsen");
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
