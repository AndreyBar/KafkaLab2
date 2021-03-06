package com.kpi;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "${message.topic.name}", groupId = "group_id")
    public void consume(ConsumerRecord message) {
        String m = String.format("Topic: %s, partition: %d, message: %s",
                message.topic(),
                message.partition(),
                message.value());
        System.out.println(m);
    }
}
