package com.ray.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcloudDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello spring cloud");
		SpringApplication.run(SpringcloudDemoApplication.class, args);
	}
}
