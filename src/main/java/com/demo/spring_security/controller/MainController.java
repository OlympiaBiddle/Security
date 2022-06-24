package com.demo.spring_security.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.spring_security.model.User;
import com.demo.spring_security.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
//    @GetMapping("/")
//    public String root() {
//        //return "index";
//    	System.out.println("IN  MainController->root()");
//    	User existing = userService.
//    	System.out.println("User firstName="+existing.getFirstName());
//        return "redirect:/students";
//    }

    @GetMapping("/index")
    public String root(Model model) {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }
    
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }
    
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}


