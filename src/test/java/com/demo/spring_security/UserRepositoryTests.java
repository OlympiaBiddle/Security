package com.demo.spring_security;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.demo.spring_security.model.User;
import com.demo.spring_security.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository repo;
	
	@Test
	private void testCreatUser() {
		User userMom = new User();
		userMom.setFirstName("Ethel");
		userMom.setLastName("Biddle");
		userMom.setEmail("ebiddle@hotmail.com");
		userMom.setPassword("rip012021");
		
		User savedUser = repo.save(userMom);
		//determines if the user was saved
		assertTrue(savedUser.getId() > 0);
	}
	
//	private void testUpdateUserDetails() {
//		User userMom = repo.findByEmail("ebiddle@hotmail.com");
//		userMom.setLastName("Jones");
//		
//		repo.save(userMom);	
//		assertTrue(userMom.getLastName() == "Jones");	
//	}
}
