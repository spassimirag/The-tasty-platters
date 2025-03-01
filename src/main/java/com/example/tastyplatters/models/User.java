package com.example.tastyplatters.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @GeneratedValue
    @Id String username;
    String password;
    int phoneNumber;

}

