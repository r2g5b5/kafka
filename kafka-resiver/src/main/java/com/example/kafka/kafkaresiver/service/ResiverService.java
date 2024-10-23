package com.example.kafka.kafkaresiver.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ResiverService {

    @KafkaListener(topics = "sender",groupId = "user-group")
    public void resiver(String s){
        System.out.println(s);
    }
}
