package com.ray.springcloud.servicemsgbus.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello_queue")
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @RabbitHandler
    public void process(String content) {
        log.info("Receiver :" + content);
    }

}
