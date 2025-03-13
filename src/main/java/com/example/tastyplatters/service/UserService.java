package com.example.tastyplatters.service;
import com.example.tastyplatters.models.Role;
import com.example.tastyplatters.models.User;

import java.util.Optional;

public interface UserService {

    void registerUser(String username, String password);

    Optional<User> findById(int id);
    Optional<User> findByUsername(String username);
    User save(User user);

}
