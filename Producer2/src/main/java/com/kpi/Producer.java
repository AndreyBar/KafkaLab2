package com.kpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Value(value = "${message.topic.name}")
    private String topicName;

    private final KafkaTemplate<String, User> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendUser(User user) {
        kafkaTemplate.send(topicName, user);
    }
}
