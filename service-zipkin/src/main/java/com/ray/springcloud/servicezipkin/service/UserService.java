package com.ray.springcloud.servicezipkin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userError")
    public String userService() {
        return this.restTemplate.getForObject("http://SERVICE-USER/", String.class);
    }

    public String userError() {
        return "sorry,user service error!";
    }
}
