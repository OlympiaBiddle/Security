package com.demo.spring_security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_security.model.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{


	
}
