package com.ray.springcloud.servicefeign.controller;

import com.ray.springcloud.servicefeign.client.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    IServiceUser serviceUser;

    @GetMapping(value = "/user")
    public String testUser() {
        return serviceUser.testFromUser();
    }
}
