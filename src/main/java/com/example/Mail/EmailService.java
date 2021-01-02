package com.example.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendMail(String to, String subject, String text) {
        try{
        	SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("amazingarticle003@gmail.com");
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(" RabbitMQ msg sent ");
        emailSender.send(message);
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
    }
}