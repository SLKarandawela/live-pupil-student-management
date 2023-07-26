package com.tritonTech.studentManagement.controller;

import com.tritonTech.studentManagement.dto.UserRegistrationDto;
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

    @RequestMapping("")
    public String userLogin(){
        return "login";
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
