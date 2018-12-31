package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Owner;
import com.spring5.springpetclinic.services.CRUDService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CRUDService<Owner, Long> {

    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
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
}
