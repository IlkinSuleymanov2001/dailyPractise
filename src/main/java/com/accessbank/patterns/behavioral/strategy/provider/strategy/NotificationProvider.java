package com.accessbank.patterns.behavioral.strategy.provider.strategy;

import com.accessbank.patterns.behavioral.strategy.dto.NotificationDto;

public interface  NotificationProvider {

    void sendNotification(String payload);
}
