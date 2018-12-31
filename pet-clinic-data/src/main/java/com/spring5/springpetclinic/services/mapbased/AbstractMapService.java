package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.services.CRUDService;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public  abstract class AbstractMapService <T, ID>   {

    protected HashMap<ID, T> map = new HashMap();


     T save(ID id , T entity) {

        map.put(id,entity);

        return map.get(id);
    }


     T findById(ID id) {
        return map.get(id);
    }


     Set <T> findAll() {
        return new HashSet<T>(map.values());
    }


     void delete(T entity) {
        map.entrySet().removeIf(entry->entry.getValue().equals(entity));


    }


     void deleteById(ID id) {

        map.remove(id);
    }
}
