package com.course.kafkaproducer.producers;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


// @Service
public class FixedRateProducer {

    private int counter=0;
    private Logger log = LoggerFactory.getLogger(FixedRateProducer.class);


    private KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    public FixedRateProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;

    }


  //  @Scheduled(fixedRate = 1000)
    public void sendMessage(){
        counter++;
        log.info("Counter is:"+counter);
        kafkaTemplate.send("t-fixedrate-2","Fixed Rate "+counter);
    }
}
