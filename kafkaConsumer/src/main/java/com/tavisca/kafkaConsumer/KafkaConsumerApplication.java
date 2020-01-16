package com.tavisca.kafkaConsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaConsumerApplication {

	@Value(value = "${message.topic.name}")
	private static String topicName;

	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
