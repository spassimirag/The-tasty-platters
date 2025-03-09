package com.example.tastyplatters.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class RegistrationRequest {
    private String username;
    private String password;
    private int phoneNumber;
}
