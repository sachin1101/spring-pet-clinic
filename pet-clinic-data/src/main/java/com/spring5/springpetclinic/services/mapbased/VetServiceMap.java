package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Vet;
import com.spring5.springpetclinic.services.CRUDService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CRUDService<Vet, Long> {
    @Override
    public Vet save(Vet entity) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }
}
