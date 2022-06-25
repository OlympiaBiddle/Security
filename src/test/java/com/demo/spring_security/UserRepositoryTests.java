package com.demo.spring_security;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.olympiabiddle.mwu.model.User;
import com.olympiabiddle.mwu.repository.UserRepository;
import com.olympiabiddle.mwu.service.UserService;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private UserService service;
	
//	@Test
//	private void testCreatUser() {
//		User userMom = new User();
//		userMom.setFirstName("Ethel");
//		userMom.setLastName("Biddle");
//		userMom.setEmail("ebiddle@hotmail.com");
//		userMom.setPassword("rip012021");
//		
//		User savedUser = repo.save(userMom);
//		//determines if the user was saved
//		assertTrue(savedUser.getId() > 0);
//	}
	
	@Test
	private void testUpdateUserDetails() {
		User user = repo.findByEmail("mikeJones@yahoo.com");
		System.out.println(user);
	}
}
