package com.CovidApp.CovidApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    public void addCoreMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedMethods("*");
    }

}
