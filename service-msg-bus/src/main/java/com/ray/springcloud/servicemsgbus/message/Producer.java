package com.ray.springcloud.servicemsgbus.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {

    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        log.info("Sender : " + context);
        this.amqpTemplate.convertAndSend("hello_queue", context);

    }
}
