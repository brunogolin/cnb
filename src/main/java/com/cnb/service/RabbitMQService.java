package com.cnb.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitTemplate template;

    public void sendMessage(String queue, Object message) {
        this.template.convertAndSend(queue, message);
    }

}
