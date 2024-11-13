package com.accessbank.patterns.behavioral.strategy.dto;

import com.accessbank.patterns.behavioral.strategy.Channel;

public class NotificationDto {
    public final  String payload;
    public final Channel channel;

    public NotificationDto(String payload, Channel channel) {
        this.payload = payload;
        this.channel = channel;
    }
}
