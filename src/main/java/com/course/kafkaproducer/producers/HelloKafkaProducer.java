package com.course.kafkaproducer.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloKafkaProducer {

    private KafkaTemplate<String,String> kafkaTemplate;

   @Autowired
   public HelloKafkaProducer(KafkaTemplate kafkaTemplate)
    {
         this.kafkaTemplate=kafkaTemplate;
    }


    public void sendHello(String name){

        kafkaTemplate.send("t-hello","Hello"+name);
    }




}
