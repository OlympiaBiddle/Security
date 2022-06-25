package com.olympiabiddle.mwu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.olympiabiddle.mwu.model.CartItem;
import com.olympiabiddle.mwu.model.Product;
import com.olympiabiddle.mwu.model.User;


public interface CartItemRepository extends CrudRepository<CartItem, Integer>{
	public List<CartItem> findByUser(User user);
	
	public CartItem findByUserAndProduct(User user, Product product);
	
	@Modifying
	@Query("UPDATE CartItem c SET c.quantity = ?1 WHERE c.user.id = ?2 AND c.product.id = ?3")
	public void updateQuantity(Integer Quantity, Integer userId, Integer productId);
	
	@Modifying
	@Query("DELETE FROM CartItem c WHERE c.user.id = ?1 AND c.product.id = ?2")
	public void deleteByUserAndProduct(Integer userId, Integer productId);
}
