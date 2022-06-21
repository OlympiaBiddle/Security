package com.demo.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring_security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  User findByEmail(String email);
	}
