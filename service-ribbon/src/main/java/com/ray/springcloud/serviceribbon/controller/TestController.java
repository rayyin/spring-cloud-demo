package com.ray.springcloud.serviceribbon.controller;

import com.ray.springcloud.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/user")
    public String testUser() {
        return testService.userService();
    }
}
