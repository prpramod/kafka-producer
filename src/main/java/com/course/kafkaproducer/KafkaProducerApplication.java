package com.course.kafkaproducer;

import com.course.kafkaproducer.producers.HelloKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {

    @Autowired
   // HelloKafkaProducer helloKafkaProducer;

    public static void main(String[] args)
    {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     //   helloKafkaProducer.sendHello("Pramod:"+Math.random());

    }
}
