package com.course.kafkaproducer.producers;

import com.course.kafkaproducer.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJsonProducer {


    private KafkaTemplate<String,String> kafkaTemplate;



    public EmployeeJsonProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    public  void sendMessage(Employee employee) {

        try {
            var json = objectMapper.writeValueAsString(employee);

            kafkaTemplate.send("t-employee",json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    
}
