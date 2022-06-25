package com.demo.spring_security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.olympiabiddle.mwu.model.CartItem;
import com.olympiabiddle.mwu.model.Product;
import com.olympiabiddle.mwu.model.User;
import com.olympiabiddle.mwu.repository.CartItemRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CartItemRepositoryTests {
	
	@Autowired
	private CartItemRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
//	@Test
//	public void testSaveItem() {
//		Integer userId = 8;
//		Integer productId = 3;
//		
//		//Using entity manager to place data into cartItem table
//		User user = entityManager.find(User.class, userId);
//		Product product = entityManager.find(Product.class, productId);
//		
//		CartItem newItem = new CartItem();
//		newItem.setUser(user);
//		newItem.setProduct(product);
//		newItem.setQuantity(1);
//		
//		CartItem savedItem = repo.save(newItem);
//		
//		assertTrue(savedItem.getId() > 0);
//	}
//	
//	@Test
//	public void testSave2Items() {
//		Integer userId = 10;
//		Integer productId = 9;
//		
//		//Using entity manager to place data into cartItem table
//		User user = entityManager.find(User.class, userId);
//		Product product = entityManager.find(Product.class, productId);
//		
//		CartItem item1 = new CartItem();
//		item1.setUser(user);
//		item1.setProduct(product);
//		item1.setQuantity(2);
//		
//		CartItem item2 = new CartItem();
//		item2.setUser(new User(userId));
//		item2.setProduct(new Product(8));
//		item2.setQuantity(3);
//		
//		Iterable<CartItem> iterable = repo.saveAll(List.of(item1, item2));
//		
//		assertTrue(((List) iterable).size() > 0);
//	}
	
//	@Test
//	public void testFindByUser() {
//		Integer userId = 10;
//		List<CartItem> listItems = repo.findByUser(new User(userId));
//		
//		listItems.forEach(System.out :: println);
//		assertTrue(listItems.size() == 2);
//	}
	
//	@Test
//	public void testFindByUserAndProduct() {
//		Integer userId = 10;
//		Integer productId = 9;
//		
//		CartItem item = repo.findByUserAndProduct(new User(userId), new Product(productId));
//		assertNotNull(item);
//		
//		System.out.println(item);
//		
//	}
	
//	@Test
//	public void updateQuantity() {
//		Integer userId = 10;
//		Integer productId = 9;
//		Integer quantity = 4;
//		
//		repo.updateQuantity(quantity, userId, productId);
//		
//		CartItem item = repo.findByUserAndProduct(new User(userId), new Product(productId));
//		assertEquals(item.getQuantity(), 4);
//	}
	
	@Test 
	public void testDeleteByCustomerAndProduct() {
		Integer userId = 10;
		Integer productId = 9;
		
		 repo.deleteByUserAndProduct(userId, productId);
		 CartItem item = repo.findByUserAndProduct(new User(userId), new Product(productId));
		 
		 assertNull(item);
	}

}
