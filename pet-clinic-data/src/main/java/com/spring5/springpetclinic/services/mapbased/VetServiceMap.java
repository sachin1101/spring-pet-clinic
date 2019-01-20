package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.Vet;
import com.spring5.springpetclinic.services.CRUDService;
import com.spring5.springpetclinic.services.SpecialityService;
import com.spring5.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet entity) {

        if(entity!= null)
        {

            if(entity.getSpecialities()!=null)
            {
                entity.getSpecialities().forEach(speciality ->{
                    if(speciality!=null && speciality.getId()==null)
                    {
                        speciality.setId(specialityService.save(speciality).getId());
                    }

                } ); //foreach
            }

            super.save(entity);
            return super.findById(entity.getId());
        }else
        {
            return entity;
        }


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
