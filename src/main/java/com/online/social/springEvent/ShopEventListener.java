package com.online.social.springEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ShopEventListener {

    /**
     *
     * @param shopEvent
     * The anotation async runs the method asynchronously
     */
    @Async("googlePoolExecutor")
    @EventListener
    public void googleChanges(ShopEvent shopEvent) {
        log.info("GoogleChanges :{}", shopEvent.getShopExample());
    }

    @Async("facebookPoolExecutor")
    @EventListener
    public void facebookChanges(ShopEvent shopEvent) {
        log.info("FacebookChanges :{}", shopEvent.getShopExample());
    }
}
