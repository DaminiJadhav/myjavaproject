package com.java.myproject.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World CI/CD!!!";
    }

    @GetMapping("/test/welcome")
    public String testWelcome() {
        return "Welcome to CI/CD!!!";
    }
}
