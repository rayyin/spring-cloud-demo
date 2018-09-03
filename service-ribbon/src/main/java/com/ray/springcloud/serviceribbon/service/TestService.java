package com.ray.springcloud.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public String userService() {
        //RestTemplate restTemplate = new RestTemplate();
        //ServiceInstance instance = loadBalancer.choose("service-user");
        //URI uri = instance.getUri();
        //System.out.println(uri);
        return this.restTemplate.getForObject("http://SERVICE-USER/", String.class);
    }
}
