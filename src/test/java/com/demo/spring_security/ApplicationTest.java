package com.demo.spring_security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import com.demo.spring_security.controller.UserRegistrationController;
import com.demo.spring_security.model.User;
import com.demo.spring_security.service.UserServiceImpl;

@SpringBootTest
public class ApplicationTest {
	private UserServiceImpl userServiceSvc;
	private UserRegistrationController urController;

	@Autowired
	public ApplicationTest(UserServiceImpl userServiceSvc, UserRegistrationController urController) {
		this.userServiceSvc = userServiceSvc;
		this.urController = urController;
	}

	@Test
	void contextLoads() {
		assertNotNull(userServiceSvc);
		assertNotNull(urController);
	}

	
	
	@Test
	void testUserServiceCurrentService() {
		UserDetails us = userServiceSvc.loadUserByUsername("mikeJones@yahoo.com");
		assertNotNull(us);
		assertTrue(us instanceof UserDetails);
		assertEquals("mikeJones@yahoo.com", us.getUsername());
	}
	

		
}
