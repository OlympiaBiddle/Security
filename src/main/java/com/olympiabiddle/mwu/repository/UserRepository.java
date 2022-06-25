package com.olympiabiddle.mwu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olympiabiddle.mwu.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  User findByEmail(String email);
	}
