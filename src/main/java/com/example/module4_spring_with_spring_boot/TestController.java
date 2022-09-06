package com.example.module4_spring_with_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping("/greeting")
    public String testGetSomething() {
        return "OK!";
    }

    @PostMapping
    public String testPostSomething() {
        return "OK!";
    }
}
