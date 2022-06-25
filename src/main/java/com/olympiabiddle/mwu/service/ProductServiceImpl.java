package com.olympiabiddle.mwu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympiabiddle.mwu.model.Product;
import com.olympiabiddle.mwu.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public Iterable<Product> findAll() {
		return productRepo.findAll();
	}

}
