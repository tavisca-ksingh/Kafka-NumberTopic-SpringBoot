package com.tavisca.kafkaConsumer.sevice;

import com.tavisca.kafkaConsumer.db.NumberService;
import com.tavisca.kafkaConsumer.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    NumberService numberService;

    @KafkaListener(topics = "NumberTopic")
    public void consume(String number){

        try {
            int num = Integer.parseInt(number);
            numberService.save(new Number(num));
            System.out.println("Consumed Number : " + number);
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

}
