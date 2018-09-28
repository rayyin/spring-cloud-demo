package com.ray.springcloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userError")
    public String userService() {
        return this.restTemplate.getForObject("http://SERVICE-USER/", String.class);
    }

    @HystrixCommand(fallbackMethod = "userError")
    public Future<String> userServiceAsync() {
        return new AsyncResult<String>() {
            @Override
            public String invoke() {
                return restTemplate.getForObject("http://SERVICE-USER/", String.class);
            }
        };
    }

    public String userError() {
        return "sorry,user service error!";
    }
}
