package com.online.social.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("shop")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopExample {
    @Id
    private String shop;

    private ShopAttribute<String> shopName;
    private ShopAttribute<String> shopDescription;

    public record ShopAttribute<T>(T attribute, boolean updated) {
    }
}


