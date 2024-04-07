package com.apirest.apirestSmadia.user.infrastructure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/test")
    public String getAllUsers() {
        return "test api complete ok..";
    }

    @GetMapping("/test-2")
    public String getAllUsers2() {
        return "test api complete 2 funciona..";
    }

    @GetMapping("/hello-1")
    public String getAllhello() {
        return "test api complete permitido.." ;
    }
    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }

}