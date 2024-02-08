package com.app.web;

import com.app.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.repository.OrderRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {

    private OrderRepository repository;

    @GetMapping(value = "/orders")
    public List<Order> getOrders() {
        return repository.findAll();
    }
}
