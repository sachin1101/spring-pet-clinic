package com.spring5.springpetclinic.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface CRUDService <T, ID> {

    T save(T entity);
    T findById(ID id);
    Set<T> findAll();
    void delete(T entity);
    void deleteById(ID id);
}
