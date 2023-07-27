package com.tritonTech.studentManagement.controller;

import com.tritonTech.studentManagement.dto.UserRegistrationDto;
import com.tritonTech.studentManagement.model.User;
import com.tritonTech.studentManagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.cert.TrustAnchor;

@Controller
@RequestMapping("")
public class AuthController {
    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String userLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user) {
        // Here you would implement the authentication logic
        // For simplicity, let's assume you have a hardcoded user with email "test@example.com" and password "password"
        if (user.getEmail().equals("test@example.com") && user.getPassword().equals("password")) {
            return "redirect:/dashboard"; // Redirect to a dashboard or home page on successful login
        } else {
            return "redirect:/login?error"; // Redirect back to the login page with an error parameter
        }
    }



    @GetMapping("/signup")
    public String userRegistration(Model model){
        model.addAttribute("user", new UserRegistrationDto());
        return "register";

    }

    @PostMapping("/signup")
    public String registerNewUser(@ModelAttribute("user") UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return "redirect:/signup?success";

    }
}
