package com.esliceu.dwes.demoboot;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBoot {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
