package com.brenogianotto.constructorBasedDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorBasedBeanConfiguration {

    @Bean
    Model model() {
        return new Model(1, "G5", "Volkswagen");
    }

    // Constructor-Based Dependency Injection
    // Injecting the bean Model into the bean Car
    @Bean
    public Car car() {
        return new Car("Gol", model(), "White");
    }
}
