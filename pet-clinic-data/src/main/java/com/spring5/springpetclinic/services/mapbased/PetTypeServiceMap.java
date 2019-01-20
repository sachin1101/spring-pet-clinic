package com.spring5.springpetclinic.services.mapbased;



import com.spring5.springpetclinic.model.PetType;
import com.spring5.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public PetType save(PetType entity) {
        return super.save(entity);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(PetType entity) {

        super.delete(entity);
    }
}
