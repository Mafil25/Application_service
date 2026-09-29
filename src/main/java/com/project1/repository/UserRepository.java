package com.project1.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.project1.exception.busines.UserAlreadyExistException;
import com.project1.model.User;
import java.util.List;

public class UserRepository implements Repository<User, Long> {

    private final Map<Long, User> userRepository = new HashMap<>();

    public void save(User user) {
        Long id = user.getId();
        if (!userRepository.containsKey(id)) {
            userRepository.put(id, user);
        } else {
            throw new UserAlreadyExistException("User/save");
        }
    }

    public Optional<User> findById(Long id) {

        return Optional.ofNullable(userRepository.get(id));
    }

    public List<User> findAll() {

        return new ArrayList<>(userRepository.values());
    }

    public void deleteById(Long id) {
        userRepository.remove(id);
    }
}
