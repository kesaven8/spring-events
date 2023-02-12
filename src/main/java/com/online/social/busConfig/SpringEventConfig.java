package com.online.social.busConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@Configuration
public class SpringEventConfig {

    @Bean(name = "googlePoolExecutor")
    public Executor getGoogleExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("google-task-");
        executor.initialize();
        return executor;
    }

    @Bean(name = "facebookPoolExecutor")
    public Executor getFacebookExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("facebook-task-");
        executor.initialize();
        return executor;
    }

}
