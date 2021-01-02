package com.example.RabbitQueue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	@Autowired 
    private RabbitTemplate template;
	public void addMessageToQueue(String msg) {
		template.convertAndSend(Config.EXCHANGE, Config.ROUTING_KEY, msg);
	}
}
