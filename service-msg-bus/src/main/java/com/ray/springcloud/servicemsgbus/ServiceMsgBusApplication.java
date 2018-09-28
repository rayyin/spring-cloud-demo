package com.ray.springcloud.servicemsgbus;

import com.ray.springcloud.servicemsgbus.message.Producer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class ServiceMsgBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMsgBusApplication.class, args);
	}

	@Value("${foo}")
	String foo;

	@Resource
	Producer producer;

	@RequestMapping(value = "/foo")
	public String foo(){
		return foo;
	}

	@RequestMapping(value = "/send")
	public String sendMsg(){
		producer.send();
		return "send message successfully";
	}
}
