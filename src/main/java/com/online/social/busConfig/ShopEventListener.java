package com.online.social.busConfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ShopEventListener {

    @EventListener
    public void listenShopChanges(ShopEvent shopEvent) {
        log.info("{}", shopEvent.getShopExample().getShop());
        log.info("{}", shopEvent.getShopExample().getShopName());
    }
}
