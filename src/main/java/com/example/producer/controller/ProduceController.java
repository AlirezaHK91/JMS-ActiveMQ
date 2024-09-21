package com.example.producer.controller;

import com.example.producer.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {
    @Autowired
    private ProduceService produceService;

    @PostMapping("/send/{message}")
    public String sendName(@PathVariable("message")String message) {
        produceService.sendName(message);
        return message;
    }
}
