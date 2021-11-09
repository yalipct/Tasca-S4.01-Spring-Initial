package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class InitialController {
   
   
    @GetMapping("/{name}")
    public String helloConNombre(@PathVariable(name = "name") String name) {
        return String.format("Hello, %s!", name);
    }
    
}
