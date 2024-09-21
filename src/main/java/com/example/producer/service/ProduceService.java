package com.example.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
//@Service
@Component
public class ProduceService {
    private final JmsTemplate jmsTemplate;
    String topic = "patients-topic";

    @Autowired
    public ProduceService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendName(String message) {
        jmsTemplate.convertAndSend(topic, message);
        System.out.println("The message sent to the topic \"  " + topic + "\" :"  + message);
    }
}
