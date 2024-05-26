package com.kafka.kafka_demo.config;


import com.kafka.kafka_demo.producer.KafkaProducer;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.logging.Logger;

@Configuration
public class KafkaTopicConfig {
    private static final Logger logger = Logger.getLogger(KafkaTopicConfig.class.getName());
    @Bean
    public NewTopic createTopic(){
        logger.info("creating topic...");
        return TopicBuilder
                .name("myTopic")
                .build();
    }
}
