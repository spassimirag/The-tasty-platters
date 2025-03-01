package com.example.tastyplatters.service;

import com.example.tastyplatters.domain.OrderEntity;
import com.example.tastyplatters.repository.OrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Component
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;


    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public OrderEntity save(OrderEntity orderEntity) {
            return orderRepository.save(orderEntity);
    }

    @Override
    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Optional<OrderEntity> findById(int id) {
        return orderRepository.findById(id);
    }


}

