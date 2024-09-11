package com.example.Apache_Kafka_Consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer3 {

    @KafkaListener(topics = "topic3", groupId = "group3")
    public void listenToTopic3(String message) {
        System.out.println("Received message from Topic3: " + message);
    }
}
