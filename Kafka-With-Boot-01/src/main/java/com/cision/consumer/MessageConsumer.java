package com.cision.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@Autowired
	private MessageStore msgStore;



	@KafkaListener(topics="first-demo",groupId="Grp1")
	public void readMessage(String message) {
		msgStore.addMessage(message);
	}
}
