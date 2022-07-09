package com.cnb.service;

import com.cnb.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "youtube")
    private void listener(Employee employee) {
        System.out.println("Listener: " + employee);
    }
}
