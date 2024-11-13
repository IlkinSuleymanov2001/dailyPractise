package com.accessbank.patterns.behavioral.strategy.factory;

import com.accessbank.patterns.behavioral.strategy.Channel;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.NotificationProvider;

public interface NotificationProviderFactoryInter {
    NotificationProvider getNotificationProvider(Channel channel);
}
