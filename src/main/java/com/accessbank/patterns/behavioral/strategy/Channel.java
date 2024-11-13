package com.accessbank.patterns.behavioral.strategy;

public enum Channel {
    SMS("sms_q"),
    MAIL("mail_q"),
    TELEGRAM("telegram_q");

    public  final String queueName;

     Channel(String queueName) {
        this.queueName = queueName;
    }
}
