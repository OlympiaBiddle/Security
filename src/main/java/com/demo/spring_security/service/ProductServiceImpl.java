package com.demo.spring_security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_security.model.Product;
import com.demo.spring_security.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public Iterable<Product> findAll() {
		return productRepo.findAll();
	}

}
