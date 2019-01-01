package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Pet;
import com.spring5.springpetclinic.services.CRUDService;
import com.spring5.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet save(Pet entity) {
        return super.save( entity);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);

    }
}
