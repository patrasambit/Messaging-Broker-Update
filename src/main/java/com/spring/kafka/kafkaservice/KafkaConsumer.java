package com.spring.kafka.kafkaservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Topic1", groupId = "sambit")
    public void consume(String message){
    }
}
