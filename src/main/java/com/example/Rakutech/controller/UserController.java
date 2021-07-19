package com.example.rakutech.controller;

import com.example.rakutech.models.User;
import com.example.rakutech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo;


    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processingRegistration(User user) {
        repo.save(user);
        return "register_success";
    }

}
