package com.example.tastyplatters.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "orders")
public class OrderEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;

    @Enumerated(EnumType.STRING)
    Status status = Status.SUCCESSFULLY_SUBMITTED;
    String username;
    String address;

    @ManyToMany
    @JoinTable(name = "order_platters",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "platter_id"))

    public List<PlatterEntity> platters;

}


