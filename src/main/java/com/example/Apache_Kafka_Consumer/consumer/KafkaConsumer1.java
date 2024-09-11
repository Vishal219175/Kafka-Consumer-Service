package com.example.Apache_Kafka_Consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer1 {

    @KafkaListener(topics = "topic1", groupId = "group1")
    public void listenToTopic1(String message) {
        System.out.println("Received message from Topic1: " + message);
    }
}