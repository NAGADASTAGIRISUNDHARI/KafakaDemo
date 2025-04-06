package com.example.Kafaka.controller;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RestController;
import com.example.Kafaka.producer.KafkaMessageProducer;  

@RestController  
public class KafkaController {  

    private final KafkaMessageProducer kafkaMessageProducer;  

    public KafkaController(KafkaMessageProducer kafkaMessageProducer) {  
        this.kafkaMessageProducer = kafkaMessageProducer;  
    }  

    @GetMapping("/send")  
    public String sendMessage(@RequestParam("message") String message) {  
        kafkaMessageProducer.sendMessage("test-topic", message);  
        return "Message sent to Kafka: " + message;  
    }  
}  