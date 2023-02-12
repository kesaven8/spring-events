package com.online.social.controller;

import com.online.social.busConfig.ShopEvent;
import com.online.social.busConfig.ShopEventPublisher;
import com.online.social.entity.ShopExample;
import com.online.social.repository.ShopExampleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    private final ShopExampleRepository shopExampleRepository;

    private final ShopEventPublisher shopEventPublisher;

    public ShopController(ShopExampleRepository shopExampleRepository, ShopEventPublisher shopEventPublisher) {
        this.shopExampleRepository = shopExampleRepository;
        this.shopEventPublisher = shopEventPublisher;
    }


    @GetMapping("/save")
    public void saveRedis() {
        var shopExample = shopExampleRepository.save(ShopExample.builder()
                .shop("shop1")
                .shopName(new ShopExample.ShopAttribute<>("test001", false)).build());

        var shopSaved = shopExampleRepository.findByShop(shopExample.getShop());
      //  shopEventPublisher.publishShopEvent(new ShopEvent(shopExample));
    }
}
