package com.brenogianotto.setterBasedDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterBasedBeanConfiguration {

    @Bean
    public Owner owner() {
        return new Owner("Breno Gianotto", 123456789);
    }

    // Setter-Based Dependency Injection
    // Injecting the bean Owner into the bean Store
    @Bean
    public Store store() {
        Store store = new Store();
        store.setName("My Store");
        store.setRegistrationNumber(55555555);
        store.setOwner(owner());

        return store;
    }
}
