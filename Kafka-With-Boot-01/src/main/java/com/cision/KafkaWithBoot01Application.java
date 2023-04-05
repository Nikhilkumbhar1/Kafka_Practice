package com.cision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka //It will create topic automatically with given names
public class KafkaWithBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaWithBoot01Application.class, args);
	}

}
