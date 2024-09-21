package com.example.producer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumeService {
    @JmsListener(destination = "patients-topic")
    public void Consume(String message) {
        System.out.println("The message read from the topic \" patients-topic \": " + message);
    }

}
