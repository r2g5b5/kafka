package com.example.kafka.kafkasender.service;

import com.example.kafka.kafkasender.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateSender(String s){
        kafkaTemplate.send(AppConstant.SENDER, s);
        return true;
    }

}
