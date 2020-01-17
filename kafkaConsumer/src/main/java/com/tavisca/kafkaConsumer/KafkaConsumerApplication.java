package com.tavisca.kafkaConsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class KafkaConsumerApplication {


	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
