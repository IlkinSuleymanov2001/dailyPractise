package com.accessbank.patterns.behavioral.strategy.queue;

public class KafkaService {

    public void sendQueue(String payload,String queueName){
        System.out.println( payload + " Sent to queue {"+queueName + "}");
    }
}
