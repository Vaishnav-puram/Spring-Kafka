package com.kafka.kafka_demo.producer;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaProducer {
    private static final Logger logger = Logger.getLogger(KafkaProducer.class.getName());
    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void pubilishMessage(String msg){
        logger.info(String.format("Sending message to 'myTopic' topic: : %s",msg));
        kafkaTemplate.send("myTopic",msg);
    }
}
