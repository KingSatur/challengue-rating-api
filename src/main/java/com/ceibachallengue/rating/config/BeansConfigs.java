package com.ceibachallengue.rating.config;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigs {

    @Bean
    public Faker faker(){
        return new Faker();
    }

}
