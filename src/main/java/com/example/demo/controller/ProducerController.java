package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.KafkaService;

@RestController
public class ProducerController {
	@Autowired
	KafkaService kafkaProducer;

	@PostMapping("/producer")
	public String sendMessage(@RequestBody User user) {
		kafkaProducer.send(user);
		return "Message sent successfully to the Kafka topic shubham";
	}
	
	@PostMapping("/producerlist")
	public String sendMessage(@RequestBody List<User> user) {
		kafkaProducer.sendList(user);
		return "Message sent successfully to the Kafka topic shubham";
	}
}
