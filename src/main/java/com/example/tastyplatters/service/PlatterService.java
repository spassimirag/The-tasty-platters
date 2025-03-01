package com.example.tastyplatters.service;

import com.example.tastyplatters.domain.PlatterEntity;
import java.util.List;
import java.util.Optional;

public interface PlatterService {

    PlatterEntity savePlatter(PlatterEntity platterEntity);
    Optional<PlatterEntity> findById(int id);
    List<PlatterEntity> findAll();
}
