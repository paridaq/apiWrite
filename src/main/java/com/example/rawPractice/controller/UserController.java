package com.example.rawPractice.controller;


import com.example.rawPractice.model.User;
import com.example.rawPractice.repository.UserRepository;
import com.example.rawPractice.response.AuthResponse;
import com.example.rawPractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private User user;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse>PostUser(@RequestBody User user){
        User gotUser = user
    }

}
