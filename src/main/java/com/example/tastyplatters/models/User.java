package com.example.tastyplatters.models;

import jakarta.persistence.*;
import lombok.*;
import com.example.tastyplatters.models.Role;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_users")
public class User {

    @GeneratedValue
    @Id
    private Integer id;
    private String username;
    private String password;
    @Getter
    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

}
