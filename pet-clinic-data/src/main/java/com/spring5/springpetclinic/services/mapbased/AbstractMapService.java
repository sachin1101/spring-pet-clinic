package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.services.CRUDService;

import java.util.*;

public  abstract class AbstractMapService <T, ID extends Long>   {

    private long elementCounter=1;

    //protected HashMap<ID, T> map = new HashMap();
    protected HashMap<Long, T> map = new HashMap();


     T save( T entity) {

        map.put(getNextId(),entity);

        return entity;
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

    private Long getNextId ()
    {

                return  elementCounter++;

    }
}
