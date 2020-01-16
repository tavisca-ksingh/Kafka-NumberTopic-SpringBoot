package com.tavisca.kafkaProducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KafkaProducerApplication.class, args);
		KafkaTemplate<String,String> producer = context.getBean(KafkaTemplate.class);
		producer.send("NumberTopic","hello World");
		producer.send("NumberTopic","What's Up");
		producer.send("NumberTopic","Never Mind");
		producer.send("NumberTopic","Gotta do SomeThing");
	}


}
