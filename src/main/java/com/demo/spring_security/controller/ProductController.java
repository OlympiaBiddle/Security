package com.demo.spring_security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.demo.spring_security.service.ProductService;

@Controller
public class ProductController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProductService productService;

	/* will display all products in the products table dynamically */	
	@GetMapping("/menu")
	public String getProducts(Model model) {
		model.addAttribute("products", productService.findAll());
		
		//logger for Product Controller
		log.info("Info log statement for Product Controller");
		log.warn("Warn log statement for Product Controller");
		log.error("Error log statement for Product Controller");
		return "menu";
	}
}
