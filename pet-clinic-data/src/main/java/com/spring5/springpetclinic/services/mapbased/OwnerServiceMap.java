package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.services.CRUDService;
import com.spring5.springpetclinic.services.OwnerService;
import com.spring5.springpetclinic.services.PetService;
import com.spring5.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    PetTypeService petTypeService;
    PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    public Owner save(Owner entity) {

        if(entity!=null)
        {


            if(entity.getPets()!=null)
            {
                entity.getPets().forEach((pet) -> {

                    if(pet.getPetType()==null)
                    {
                        throw new IllegalArgumentException("PetType Cannot be null");
                    }

                    if(pet.getPetType().getId()==null) //save this petType to PetTypeService repository
                    {
                        pet.getPetType().setId(petTypeService.save(pet.getPetType()).getId());
                    }

                    if(pet.getId()==null) //save this pet to repository
                    {
                       pet.setId(petService.save(pet).getId());
                    }

                }); //forEach
            }


            return super.save( entity);
        }else
        {
            return null;
        }

    }

    public Owner findById(Long id) {
        return super.findById(id);
    }


    public Set<Owner> findAll() {
        return super.findAll();
    }


    public void deleteById(Long id) {

        super.deleteById(id);
    }

    public void delete(Owner entity) {

        super.delete(entity);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
