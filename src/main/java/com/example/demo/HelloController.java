package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot 🚀";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the about page";
    }
}