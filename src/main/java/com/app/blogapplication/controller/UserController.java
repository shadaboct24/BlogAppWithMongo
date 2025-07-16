package com.app.blogapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/sayhello")
    public String sayHello() {
        return "Hello, Usr!";
    }
}
