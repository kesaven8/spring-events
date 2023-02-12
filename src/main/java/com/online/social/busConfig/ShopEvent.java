package com.online.social.busConfig;

import com.online.social.entity.ShopExample;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@ToString
public class ShopEvent extends ApplicationEvent {

    private ShopExample shopExample;

    public ShopEvent(Object source) {
        super(source);
    }

    public ShopExample getShopExample() {
        return shopExample;
    }
}
