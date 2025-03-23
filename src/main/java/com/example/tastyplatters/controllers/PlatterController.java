package com.example.tastyplatters.controllers;

import com.example.tastyplatters.domain.PlatterEntity;
import com.example.tastyplatters.service.PlatterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/platter")
public class PlatterController {

    private final PlatterService platterService;

    PlatterController(PlatterService platterService) {
        this.platterService = platterService;
    }

    @GetMapping(value = "/getall")
    public List<PlatterEntity> getAllPlatters() {
        return platterService.findAll();
    }

    @GetMapping(value = "/getplatter/{id}/")
    public Optional<PlatterEntity> getPlatterById(@PathVariable("id") Integer id) {
        Optional<PlatterEntity> platter = platterService.findById(id);
        if (platter.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Platter not found, please make sure you have a valid platter ID");
        }
        return platter;
    }
}