package com.demo.spring_security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.spring_security.controller.UserRegistrationDto;
import com.demo.spring_security.model.User;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
   
}
