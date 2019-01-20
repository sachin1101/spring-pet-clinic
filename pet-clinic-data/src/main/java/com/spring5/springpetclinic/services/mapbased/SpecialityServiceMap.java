package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Speciality;
import com.spring5.springpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService< Speciality, Long> implements SpecialityService {


    @Override
    public Speciality save(Speciality entity) {
        return super.save(entity);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Speciality entity) {

        super.delete(entity);
    }
}
