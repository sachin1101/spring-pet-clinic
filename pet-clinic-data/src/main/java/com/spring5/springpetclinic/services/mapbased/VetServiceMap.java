package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Vet;
import com.spring5.springpetclinic.services.CRUDService;
import com.spring5.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet save(Vet entity) {
        super.save(entity);
        return super.findById(entity.getId());
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

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
