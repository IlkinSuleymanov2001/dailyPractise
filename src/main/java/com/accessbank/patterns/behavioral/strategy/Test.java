package com.accessbank.patterns.behavioral.strategy;

import com.accessbank.patterns.behavioral.strategy.dto.NotificationDto;
import com.accessbank.patterns.behavioral.strategy.factory.NotificationProviderFactory;
import com.accessbank.patterns.behavioral.strategy.provider.NotificationService;

public class Test {

    public static void main(String[] args) {
        NotificationService notificationService =
                new NotificationService(new NotificationProviderFactory());

        NotificationDto notificationDto =
                new NotificationDto( "Hello World",Channel.SMS);

        notificationService.handleMessage(notificationDto);
    }
}
