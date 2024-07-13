package com.example.DemoProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
    
    @RequestMapping("/user")
    public String getPageUser() {
        return "./login.html";
    }
    
}
