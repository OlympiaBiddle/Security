package com.demo.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.demo.spring_security.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	/* will display all products in the products table dynamically */	
	@GetMapping("/menu")
	public String getProducts(Model model) {
		model.addAttribute("products", productService.findAll());
		return "menu";
	}
}
