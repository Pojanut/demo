package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {
    @GetMapping
    public WelcomeEntity hello() {
        return new WelcomeEntity("hello world test change");
    }
}
