package com.project1.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.project1.exception.busines.AlreadyExistException;
import com.project1.model.User;
import java.util.List;

public class UserRepository implements Repository<Long, User> {

    private final Map<Long, User> userRepository = new HashMap<>();

    public synchronized void save(User user) {
        Long id = user.getId();
        if (userRepository.containsKey(id)) {
            throw new AlreadyExistException("UserService/save");
        }   
        userRepository.put(id, user);
    }

    public synchronized Optional<User> findById(Long id) {

        return Optional.ofNullable(userRepository.get(id));
    }

    public synchronized List<User> findAll() {

        return new ArrayList<>(userRepository.values());
    }

    public synchronized void deleteById(Long id) {
        userRepository.remove(id);
    }

    public synchronized boolean existsById(Long id) {
        return userRepository.containsKey(id);
    }
}
