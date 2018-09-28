package com.ray.springcloud.servicezipkin.controller;

import com.ray.springcloud.servicezipkin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user")
    public String testUser() {
        return userService.userService();
    }
}
