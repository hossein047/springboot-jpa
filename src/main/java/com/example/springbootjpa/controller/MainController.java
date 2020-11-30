package com.example.springbootjpa.controller;

import com.example.springbootjpa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private final UserService service;

    public MainController(UserService service) {
        this.service = service;
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
