package com.online.social.repository;

import com.online.social.entity.ShopExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShopExampleRepository extends CrudRepository<ShopExample, String> {
}
