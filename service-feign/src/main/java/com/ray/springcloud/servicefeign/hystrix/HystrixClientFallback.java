package com.ray.springcloud.servicefeign.hystrix;

import com.ray.springcloud.servicefeign.client.IServiceUser;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements IServiceUser{

    public String testFromUser(){
        return "fallBack testFromUser";
    }
}
