package com.online.social.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
public class Config {

    @Value("${redis.host:localhost}")
    private String redisHostName;

    @Value("${redis.port:6379}")
    private Integer redisPort;

    @Bean
    public LettuceConnectionFactory redisStandAloneConnectionFactory() {
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration(redisHostName, redisPort));
    }

}
