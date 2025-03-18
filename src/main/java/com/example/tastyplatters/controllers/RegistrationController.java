package com.example.tastyplatters.controllers;

import com.example.tastyplatters.models.UserEntity;
import com.example.tastyplatters.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/tastyplatters")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/registration")
        public UserEntity register(@RequestBody UserEntity registeredUser) {
        return userService.save(registeredUser);

        }
    }


