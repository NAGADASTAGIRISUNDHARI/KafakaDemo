package com.example.Kafaka.consumer;

import org.springframework.kafka.annotation.KafkaListener;  
import org.springframework.stereotype.Component;  

@Component  
public class KafkaMessageConsumer {  

    @KafkaListener(topics = "test-topic", groupId = "test-group")  
    public void listen(String message) {  
        System.out.println("Received message: " + message);  
    }  
}  
