package com.demo.spring_security.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.spring_security.model.Product;



public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
