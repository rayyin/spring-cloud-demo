package com.ray.springcloud.servicefeign.client;

import com.ray.springcloud.servicefeign.hystrix.HystrixClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-user", fallback = HystrixClientFallback.class)
public interface IServiceUser {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String testFromUser();
}

