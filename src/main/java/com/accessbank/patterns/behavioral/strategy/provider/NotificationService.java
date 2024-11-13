package com.accessbank.patterns.behavioral.strategy.provider;

import com.accessbank.patterns.behavioral.strategy.dto.NotificationDto;
import com.accessbank.patterns.behavioral.strategy.factory.NotificationProviderFactoryInter;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.NotificationProvider;

public class NotificationService {

    private final NotificationProviderFactoryInter notificationProviderFactory;

    public NotificationService(NotificationProviderFactoryInter notificationProviderFactory) {
        this.notificationProviderFactory = notificationProviderFactory;
    }

    public void handleMessage(NotificationDto notification){
        NotificationProvider notificationProvider = notificationProviderFactory.getNotificationProvider(notification.channel);
        notificationProvider.sendNotification(notification.payload);
    }
}
