package com.accessbank.patterns.behavioral.strategy.factory;

import com.accessbank.patterns.behavioral.strategy.Channel;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.MailProvider;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.NotificationProvider;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.SmsProvider;
import com.accessbank.patterns.behavioral.strategy.provider.strategy.TelegramProvider;
import com.accessbank.patterns.behavioral.strategy.queue.KafkaService;

public class NotificationProviderFactory implements NotificationProviderFactoryInter {

    SmsProvider smsProvider = new SmsProvider().setQueueKafkaService(new KafkaService());
    TelegramProvider telegramProvider = new TelegramProvider();
    MailProvider mailProvider = new MailProvider();

    @Override
    public NotificationProvider getNotificationProvider(Channel channel) {
        return switch (channel) {
            case SMS -> smsProvider;
            case MAIL -> mailProvider;
            case TELEGRAM -> telegramProvider;
        };
    }
}
