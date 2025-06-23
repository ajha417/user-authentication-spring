package com.learn.spring.userauthenticationspring.controller;

import com.learn.spring.userauthenticationspring.dto.SignUpDto;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
