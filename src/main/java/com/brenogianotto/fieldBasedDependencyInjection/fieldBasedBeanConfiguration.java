package com.brenogianotto.fieldBasedDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fieldBasedBeanConfiguration {

    @Bean
    public Mayor mayor() {
        return new Mayor();
    }

    @Bean City city() {
        return new City();
    }
}
