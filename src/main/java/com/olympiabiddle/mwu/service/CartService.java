package com.olympiabiddle.mwu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympiabiddle.mwu.model.CartItem;
import com.olympiabiddle.mwu.model.Product;
import com.olympiabiddle.mwu.model.User;
import com.olympiabiddle.mwu.repository.CartItemRepository;

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