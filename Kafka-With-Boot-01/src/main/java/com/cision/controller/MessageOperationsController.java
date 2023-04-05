package com.cision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cision.consumer.MessageStore;
import com.cision.producer.MessageProducer;

@RestController
public class MessageOperationsController {

	@Autowired
	private MessageProducer producer;

	@Autowired
	private MessageStore store;

	@GetMapping("/send")
	public ResponseEntity<String> sendMessage(@RequestParam("message")String msg){
		String sendMessage = producer.sendMessage(msg);
		return new ResponseEntity<>(sendMessage,HttpStatus.OK);
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<String>> showAllMessages(){
		List<String> showAllMessages = store.showAllMessages();
		return new ResponseEntity<>(showAllMessages,HttpStatus.OK);

	}
}
