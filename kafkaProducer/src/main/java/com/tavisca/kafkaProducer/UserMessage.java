package com.tavisca.kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserMessage {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value(value = "${message.topic.name}")
    private String topicName;

    @GetMapping("/Number/{message}")
    public String post(@PathVariable("message") final  String message){
        kafkaTemplate.send(topicName,message);
        return "Published successfully";
    }


}
