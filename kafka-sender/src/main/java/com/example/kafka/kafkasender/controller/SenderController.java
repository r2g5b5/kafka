package com.example.kafka.kafkasender.controller;

import com.example.kafka.kafkasender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sender")
public class SenderController {
    @Autowired
    private SenderService service;


    @PutMapping
    public ResponseEntity updateSender() throws InterruptedException {

        int range=100;
        while (range>0){
                service.updateSender(Math.random()+" , "+Math.random());
                Thread.sleep(500);
                range--;
        }

        return new ResponseEntity<>(Map.of("message", "SSSSSSSSS"), HttpStatus.OK);
    }
}
