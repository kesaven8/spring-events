package com.online.social.springEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ShopEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;


    public ShopEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishShopEvent(ShopEvent shopEvent) {
        applicationEventPublisher.publishEvent(shopEvent);
    }
}
