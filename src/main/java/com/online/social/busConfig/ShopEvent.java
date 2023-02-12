package com.online.social.busConfig;

import com.online.social.entity.ShopExample;
import org.springframework.context.ApplicationEvent;

public class ShopEvent extends ApplicationEvent {
    private ShopExample shopExample;

    public ShopEvent(ShopExample source) {
        super(source);
        this.shopExample = source;
    }

    public ShopExample getShopExample() {
        return shopExample;
    }
}
