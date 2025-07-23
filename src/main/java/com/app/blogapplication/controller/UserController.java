package com.app.blogapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.blogapplication.models.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/blogapplication")
public class UserController {

    @GetMapping("/sayhello")
    public String sayHello() {
        return "Hello, Usr!";
    }

    @PostMapping("/saveuserdata")
    public ResponseEntity<?> saveUserData(@RequestBody @Valid User user) {

        return ResponseEntity.ok(user.getUser_name());
    }
}
