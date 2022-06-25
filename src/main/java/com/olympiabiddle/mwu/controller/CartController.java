package com.olympiabiddle.mwu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olympiabiddle.mwu.model.CartItem;
import com.olympiabiddle.mwu.model.Product;
import com.olympiabiddle.mwu.service.CartService;
import com.olympiabiddle.mwu.service.UserService;

@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private UserService userService;

	
//	@PostMapping("/addToCart")
//	public String addProduct(Model model, @RequestParam("pId") Integer productId,
//			@RequestParam("quantity") int quantity, @Request {
//
//		return "";
//	}

}
