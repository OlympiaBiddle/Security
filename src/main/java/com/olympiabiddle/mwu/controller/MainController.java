package com.olympiabiddle.mwu.controller;



import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.olympiabiddle.mwu.model.User;
import com.olympiabiddle.mwu.service.UserService;

@Controller
public class MainController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
    public String root(HttpSession session,Authentication authentication) {
        //return "index";
    	//System.out.println("IN  MainController->root()");
    	System.out.println(">>>>>>>USER ="+authentication.getName());
    	User existing = userService.findByEmail(authentication.getName());
    	System.out.println("User firstName="+existing.getFirstName());
    	System.out.println("User lastName="+existing.getLastName());
    	System.out.println("User Id="+existing.getId());
    	
    	//logger for Main Controller
		log.info("Info log statement for Main Controller");
		log.warn("Warn log statement for Main Controller");
		log.error("Error log statement for Main Controller");
    	
        return "index";
    }

//    @GetMapping("/index")
//    public String root(Model model) {
//        return "index";
//    }

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


