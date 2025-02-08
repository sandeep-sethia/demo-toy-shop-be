package com.test.demo_be.controllers;

import com.test.demo_be.models.AppUser;
import com.test.demo_be.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AppUserRepository appUserRepository;

    @PostMapping("/login")
    public String login(@RequestBody AppUser appUser) {
        AppUser foundAppUser = appUserRepository.findByUsername(appUser.getUsername());
        if (foundAppUser != null && foundAppUser.getPassword().equals(appUser.getPassword())) {
            return "JWT-TOKEN"; // Mock JWT token for now
        }
        return "Invalid credentials";
    }
}
