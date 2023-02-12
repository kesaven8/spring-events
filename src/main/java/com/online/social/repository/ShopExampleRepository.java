package com.online.social.repository;

import com.online.social.entity.ShopExample;
import org.springframework.data.keyvalue.repository.KeyValueRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopExampleRepository extends KeyValueRepository<ShopExample, Long> {

    ShopExample findByShop(String shop);
}
