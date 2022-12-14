package org.shemenev.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.shemenev.spring.rest")
public class MyConfig {


    // будет использован для http запросов
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
