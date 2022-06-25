package com.olympiabiddle.mwu.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.olympiabiddle.mwu.controller.UserRegistrationDto;
import com.olympiabiddle.mwu.model.User;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
