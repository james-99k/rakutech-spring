package com.example.rakutech.controllers;

import com.example.rakutech.models.User;
import com.example.rakutech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping("/signup")
    public String signup() {

        System.out.println("Sign Up");
        return ("signup.html");
    }

    @RequestMapping("/signin")
    public String signin() {

        System.out.println("Sign In");
        return "signin";
    }

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String fullName, @RequestParam String email) {

        User user = new User();
        user.setFullName(fullName);
        user.setEmail(email);
        userRepository.save(user);
        return "User Created";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable < User > getAllUsers() {
        return userRepository.findAll();
    }
}