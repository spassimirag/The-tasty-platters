package com.example.tastyplatters.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "platters")
public class PlatterEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String title;
    private double price;
    private String description;

    @ManyToMany(mappedBy = "platters")
    @JsonIgnore
    public Set<OrderEntity> orders;

}


