//package com.example.tastyplatters;
//
//import com.example.tastyplatters.domain.Order;
//import com.example.tastyplatters.domain.OrderEntity;
//import com.example.tastyplatters.repository.OrderRepository;
//import com.example.tastyplatters.service.OrderServiceImpl;
//import lombok.Builder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SchedulerForTesting {
//
//    @Autowired
//    public OrderRepository orderRepository;
//    @Autowired
//    public OrderServiceImpl orderServiceImpl;
//
//    SchedulerForTesting(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @Scheduled(fixedRate = 2000)
//    public void scheduledTask() {
//        OrderEntity savedOrder = orderServiceImpl.save(345, "active", "radi", "Lozenets");
//        System.out.println("Order saved: " + savedOrder);
//
//    }
//
//}