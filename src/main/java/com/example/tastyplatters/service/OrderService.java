package com.example.tastyplatters.service;

import com.example.tastyplatters.domain.Order;
import com.example.tastyplatters.domain.OrderEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface OrderService {

    OrderEntity save(OrderEntity orderEntity);
    List<OrderEntity> findAll();
    void deleteOrderById(int id);
    Optional<OrderEntity> findById(int id);

}
