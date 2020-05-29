package com.course.kafkaproducer;

import com.course.kafkaproducer.producers.HelloKafkaProducer;
import com.course.kafkaproducer.producers.KafkaKeyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// @EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {

    @Autowired
    private KafkaKeyProducer kafkaKeyProducer;
   // HelloKafkaProducer helloKafkaProducer;

    public static void main(String[] args)
    {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     //   helloKafkaProducer.sendHello("Pramod:"+Math.random());

        for(int i=0;i<10000;i++){
            var key ="key-"+(i%5);
            var data="data "+i+" with key "+key;
            kafkaKeyProducer.send(key,data);
            Thread.sleep(5000);

        }

    }
}
