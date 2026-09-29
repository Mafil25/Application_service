package com.project1.repository;

import java.util.Optional;

interface Repository<T, ID> {


    void save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);
    
}
