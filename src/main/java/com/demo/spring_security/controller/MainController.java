package com.demo.spring_security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

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


