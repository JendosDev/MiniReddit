package com.example.MiniReddit.controller;

import com.example.MiniReddit.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("api/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration was successful", OK);
    }

    @GetMapping("/accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account was Activated Successfully", OK);
    }

}
