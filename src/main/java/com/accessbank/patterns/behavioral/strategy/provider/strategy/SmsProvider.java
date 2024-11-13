package com.accessbank.patterns.behavioral.strategy.provider.strategy;

import com.accessbank.patterns.behavioral.strategy.Channel;
import com.accessbank.patterns.behavioral.strategy.queue.KafkaService;

public class SmsProvider implements NotificationProvider {

    private KafkaService kafkaService;

    public SmsProvider setQueueKafkaService(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
        return this;
    }

    @Override
    public void sendNotification(String payload) {
        kafkaService.sendQueue(payload, Channel.SMS.queueName);
    }
}
