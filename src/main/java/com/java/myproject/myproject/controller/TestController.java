package com.java.myproject.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "Hello World CI/CD!!!";
    }

    @GetMapping("/welcome")
    public String testWelcome() {
        return "Welcome to CI/CD!!!";
    }

    @GetMapping("/addition")
    public Integer addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}
