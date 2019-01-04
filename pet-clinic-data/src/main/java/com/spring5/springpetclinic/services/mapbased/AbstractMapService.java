package com.spring5.springpetclinic.services.mapbased;

import com.spring5.springpetclinic.model.BaseEntity;
import com.spring5.springpetclinic.services.CRUDService;

import java.util.*;

public  abstract class AbstractMapService <T extends BaseEntity, ID extends Long>   {


    //protected HashMap<ID, T> map = new HashMap();
    protected HashMap<Long, T> map = new HashMap();


     T save( T entity) {

         if(entity!=null)
         {
             if(entity.getId()==null)
             {
                 entity.setId(getNextId());
             }
             map.put(getNextId(),entity);
         }else
         {
             throw new IllegalArgumentException(" Input is null in the Save method");
         }


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
        try {
            return Collections.max(map.keySet()) + 1L;
        }catch (NoSuchElementException e)
        {
            return 1L;
        }



    }
}
