package com.demo.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_security.model.CartItem;
import com.demo.spring_security.model.Product;
import com.demo.spring_security.model.User;
import com.demo.spring_security.repository.CartItemRepository;

@Service
public class CartService {
	@Autowired
	private CartItemRepository cartRepo;

	public Integer addProduct(Integer productId, Integer quantity, User user) {
		Integer updatedQuantity = quantity;
		Product product = new Product(productId);
		CartItem cartItem = cartRepo.findByUserAndProduct(user, product);

		if (cartItem != null) {
			updatedQuantity = cartItem.getQuantity() + quantity;
			cartItem.setQuantity(updatedQuantity);
		} else {
			cartItem = new CartItem();
			cartItem.setUser(user);
			cartItem.setProduct(product);
		}
		cartItem.setQuantity(updatedQuantity);

		cartRepo.save(cartItem);

		return updatedQuantity;
	}
}