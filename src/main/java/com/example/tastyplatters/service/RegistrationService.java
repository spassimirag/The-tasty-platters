package com.example.tastyplatters.service;

import com.example.tastyplatters.controllers.RegistrationRequest;
import org.springframework.stereotype.Service;


@Service
public class RegistrationService {

    public String register(RegistrationRequest registrationRequest) {
        return "works";
    }
}

