package com.course.kafkaproducer.producers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyProducer {

    private KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    public KafkaKeyProducer(KafkaTemplate kafkaTemplate){

        this.kafkaTemplate=kafkaTemplate;
    }


    public void send(String key,String data){


        kafkaTemplate.send("t_multi_partition",key,data);
    }
}
