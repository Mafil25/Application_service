package com.project1.repository;

import java.util.List;
import java.util.Optional;

interface Repository<ID, T> {

    void save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    boolean existsById(ID id);
    
}
