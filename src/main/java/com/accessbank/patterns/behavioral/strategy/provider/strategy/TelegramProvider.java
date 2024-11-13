package com.accessbank.patterns.behavioral.strategy.provider.strategy;

public class TelegramProvider implements NotificationProvider {
    @Override
    public void sendNotification(String payload) {
        System.out.println("payload sent to telegram ");
    }
}
