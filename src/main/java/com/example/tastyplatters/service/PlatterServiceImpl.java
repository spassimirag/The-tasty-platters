package com.example.tastyplatters.service;

import com.example.tastyplatters.domain.PlatterEntity;
import com.example.tastyplatters.repository.PlatterRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Component
public class PlatterServiceImpl implements PlatterService {

    private final PlatterRepository platterRepository;

    PlatterServiceImpl(PlatterRepository platterRepository) {
        this.platterRepository = platterRepository;
    }

    @Override
    public PlatterEntity savePlatter(PlatterEntity platterEntity) {
        return platterRepository.save(platterEntity);

    }

    @Override
    public Optional<PlatterEntity> findById(int id) {
        return platterRepository.findById(id);
    }


    @Override
    public List<PlatterEntity> findAll() {
        return platterRepository.findAll();

    }

}
