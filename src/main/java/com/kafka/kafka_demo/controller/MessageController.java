package com.kafka.kafka_demo.controller;

import com.kafka.kafka_demo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        kafkaProducer.pubilishMessage(message);
        return ResponseEntity.ok("Message published successfully !");
    }
}
