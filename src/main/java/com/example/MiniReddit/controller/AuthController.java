package com.example.MiniReddit.controller;

import com.example.MiniReddit.controller.reg.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @PostMapping("/sign-up")
    public void signup(@RequestBody RegisterRequest registerRequest) {

    }
}
