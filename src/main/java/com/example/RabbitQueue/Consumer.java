package com.example.RabbitQueue;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Mail.EmailService;
@Component
public class Consumer {
	
	@Autowired
	EmailService mailService;

	@RabbitListener(queues = Config.QUEUE)
	public void consumeMessageFromQueue(String msg)
	{

		mailService.sendMail(msg, "Demo Mail", "Body of Demo Mail");
		System.out.println("Message received from queue => "+ msg);
	}
	
}