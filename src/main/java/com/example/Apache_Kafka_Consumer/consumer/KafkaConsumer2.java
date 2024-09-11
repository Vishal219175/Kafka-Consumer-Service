package com.example.Apache_Kafka_Consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer2 {

    @KafkaListener(topics = "topic2", groupId = "group2")
    public void listenToTopic2(String message) {
        System.out.println("Received message from Topic2: " + message);
    }
}
