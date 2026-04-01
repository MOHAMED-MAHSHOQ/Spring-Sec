package com.udemy.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/healthy")
    public String isHealthy(){
        return "Healthy";
    }
}
