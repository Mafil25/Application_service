package com.project1.service;

import com.project1.exception.busines.AlreadyExistException;
import com.project1.model.Application;
import com.project1.model.User;
import com.project1.repository.Repository;

public class ApplicationService {

    private final Repository repository;

    public void create(Long id, User user, String title, Repository repository) {

        if (repository.existsById(id)) {
            throw new AlreadyExistException("ApplicationService/create");
        }

        Application application = new Application(id, user, title);

        repository.save(id, application);

    }




    
}
