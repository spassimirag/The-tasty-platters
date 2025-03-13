package com.example.tastyplatters.controllers;

import com.example.tastyplatters.domain.OrderEntity;
import com.example.tastyplatters.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tastyplatters/user")
public class OrderController {

    private final OrderService orderService;

    public OrderController (OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/getall/orders")
    public List<OrderEntity> getOrders() {
        return orderService.findAll();
    }

    @GetMapping(value = "/getorder/{id}")
    public Optional<OrderEntity> findById(@PathVariable("id") Integer id) {
        Optional<OrderEntity> orderEntity = orderService.findById(id);
        if (orderEntity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found, please make sure you have a valid order ID.");
        }
        return orderEntity;
    }


    @PostMapping(value = "/order")
    public OrderEntity create(@RequestBody OrderEntity order) {
       return orderService.save(order);

    }

    @DeleteMapping(value = "/cancelorder{id}")
    public void delete(@PathVariable("id") Integer id)  {
        orderService.deleteOrderById(id);

    }

}
