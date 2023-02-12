package com.online.social.controller;

import com.online.social.busConfig.ShopEvent;
import com.online.social.busConfig.ShopEventPublisher;
import com.online.social.entity.ShopExample;
import com.online.social.repository.ShopExampleRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ShopController {

    private final ShopExampleRepository shopExampleRepository;

    private final ShopEventPublisher shopEventPublisher;

    public ShopController(ShopExampleRepository shopExampleRepository, ShopEventPublisher shopEventPublisher) {
        this.shopExampleRepository = shopExampleRepository;
        this.shopEventPublisher = shopEventPublisher;
    }

    @PostMapping("/save")
    public void saveShop(@RequestBody ShopExample shopExample) {
        var savedShop = shopExampleRepository.findById(shopExample.getShop()).orElse(null);

        if (savedShop.getShopDescription() == null || !Objects.equals(savedShop.getShopDescription().attribute(), shopExample.getShopDescription().attribute())) {
           shopExample.setShopDescription(new ShopExample.ShopAttribute<>(shopExample.getShopDescription().attribute(),true));
           shopEventPublisher.publishShopEvent(new ShopEvent(shopExample));
        }

    }
}
