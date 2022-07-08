package com.cnb.connection;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RabbitMQConnection {

    private static final String NAME_EXCHANGE = "amq.direct";
    private AmqpAdmin amqpAdmin;

    public RabbitMQConnection(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    private Queue queue(String name) {
        return new Queue(name, true, false, false);
    }

    private DirectExchange exchange() {
        return new DirectExchange(NAME_EXCHANGE, true, false);
    }

    private Binding relationship(Queue queue, DirectExchange exchange) {
        return new Binding(queue.getName(), Binding.DestinationType.QUEUE, exchange.getName(), queue.getName(), null);
    }

    @PostConstruct
    private void add() {
        Queue queueYoutube = this.queue("youtube");

        DirectExchange exchange = this.exchange();

        Binding relationship = this.relationship(queueYoutube, exchange);

        this.amqpAdmin.declareQueue(queueYoutube);

        this.amqpAdmin.declareExchange(exchange);

        this.amqpAdmin.declareBinding(relationship);
    }
}
