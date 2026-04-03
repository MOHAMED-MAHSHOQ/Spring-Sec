package com.udemy.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/healthy")
public class BasicController {
    @GetMapping
    @PreAuthorize("hasAuthority('GET')")
    public String isHealthy(){
        return "Healthy";
    }

    @PostMapping
    public String isPost(){
        return "Posted Successfully";
    }

    @DeleteMapping
    public String isDelete(){
        return "Deleted Successfully";
    }

    @PutMapping
    public String isPut(){
        return "Updated SuccessFully";
    }
}
