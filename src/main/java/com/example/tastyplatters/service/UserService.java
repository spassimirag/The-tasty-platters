package com.example.tastyplatters.service;
import com.example.tastyplatters.models.Role;
import com.example.tastyplatters.models.UserEntity;

import java.util.Optional;

public interface UserService {

    Optional<UserEntity> findById(int id);
    UserEntity save(UserEntity user);

}
