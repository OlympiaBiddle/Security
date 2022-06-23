package com.demo.spring_security.service;

import java.util.List;
import java.util.Optional;

import com.demo.spring_security.model.Product;

public interface ProductService {

	
	public Iterable<Product> findAll();
	
}
