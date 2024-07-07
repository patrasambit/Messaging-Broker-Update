package com.spring.kafka.kafkaservice;

import com.spring.kafka.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "Topic1", groupId = "sambit")
    public void consume(User user){
    }
}
