package com.learn.spring.userauthenticationspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/auth/register")
    public String register(){
        return "signup";
    }

    @GetMapping("/auth/login")
    public String login(){
        return "login";
    }
}
