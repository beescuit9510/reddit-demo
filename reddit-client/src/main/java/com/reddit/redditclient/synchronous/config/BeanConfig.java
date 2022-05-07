package com.reddit.redditclient.synchronous.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class BeanConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
