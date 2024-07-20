package com.CovidApp.CovidApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public RestTemplate getInstance()
    {
        return new RestTemplate();
    }
}
