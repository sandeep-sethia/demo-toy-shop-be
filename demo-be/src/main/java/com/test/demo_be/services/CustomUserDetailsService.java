package com.test.demo_be.services;

import com.test.demo_be.models.AppUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AppUser appUser1 = AppUser.builder()
                .id(1L)
                .username("sandy")
                .password("welcome123")
                .build();

        return new UserPrinciple(appUser1);
    }
}
