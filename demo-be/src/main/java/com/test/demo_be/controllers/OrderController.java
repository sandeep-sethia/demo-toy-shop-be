package com.test.demo_be.controllers;

import com.test.demo_be.models.ToyOrder;
import com.test.demo_be.repositories.ToyOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private ToyOrderRepository toyOrderRepository;

    @PostMapping("/place")
    public String placeOrder(@RequestBody ToyOrder toyOrder) {
        toyOrderRepository.save(toyOrder);
        return "Order placed successfully!";
    }

    @GetMapping("/all")
    public List<ToyOrder> getOrders() {
        return toyOrderRepository.findAll();
    }
}
