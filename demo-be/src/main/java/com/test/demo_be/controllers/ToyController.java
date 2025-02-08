package com.test.demo_be.controllers;

import com.test.demo_be.dto.Toy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ToyController {
    @GetMapping("/toys")
    public List<Toy> getToys() {
        return Arrays.asList(
                new Toy(1L, "Toy 1", "Description 1"),
                new Toy(2L, "Toy 2", "Description 2")
        );
    }

    @PostMapping("/order")
    public ResponseEntity<String> placeOrder(@RequestBody List<Toy> toys) {
        // Logic to process the order
        return ResponseEntity.ok("Order placed successfully");
    }
}
