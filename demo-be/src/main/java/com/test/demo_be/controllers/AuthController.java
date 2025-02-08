package com.test.demo_be.controllers;

import com.test.demo_be.dto.AuthRequest;
import com.test.demo_be.dto.AuthResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo_be.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        // Dummy authentication (replace with actual user validation)
        System.out.println("username = " +request.getUsername());
        System.out.println("password = " +request.getPassword());
        return new AuthResponse(jwtUtil.generateToken(request.getUsername()));
    }
}
