package com.example.MiniReddit.service;

import com.example.MiniReddit.controller.reg.RegisterRequest;
import com.example.MiniReddit.model.User;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.Instant;

@Service
public class AuthService {
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);
    }
}
