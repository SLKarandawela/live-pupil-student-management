package com.tritonTech.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AuthController {
    @RequestMapping("")
    public String userLogin(){
        return "login";
    }
}
