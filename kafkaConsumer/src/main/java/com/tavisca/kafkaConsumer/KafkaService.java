package com.tavisca.kafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @KafkaListener(topics = "NumberTopic",groupId = "demo")
    public void consume(String message){
        System.out.println("Consumed Message : " + message);
    }

}
