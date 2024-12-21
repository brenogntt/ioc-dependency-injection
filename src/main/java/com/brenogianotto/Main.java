package com.brenogianotto;

import com.brenogianotto.constructorBasedDependencyInjection.ConstructorBasedBeanConfiguration;
import com.brenogianotto.constructorBasedDependencyInjection.Car;
import com.brenogianotto.fieldBasedDependencyInjection.City;
import com.brenogianotto.fieldBasedDependencyInjection.Mayor;
import com.brenogianotto.fieldBasedDependencyInjection.fieldBasedBeanConfiguration;
import com.brenogianotto.setterBasedDependencyInjection.SetterBasedBeanConfiguration;
import com.brenogianotto.setterBasedDependencyInjection.Store;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext constructorBasedBeanConfiguration = new AnnotationConfigApplicationContext(ConstructorBasedBeanConfiguration.class);
        ApplicationContext setterBasedBeanConfiguration = new AnnotationConfigApplicationContext(SetterBasedBeanConfiguration.class);
        ApplicationContext fieldBasedBeanConfiguration = new AnnotationConfigApplicationContext(com.brenogianotto.fieldBasedDependencyInjection.fieldBasedBeanConfiguration.class);

        Car car = constructorBasedBeanConfiguration.getBean(Car.class);
        Store store = setterBasedBeanConfiguration.getBean(Store.class);
        City city = fieldBasedBeanConfiguration.getBean(City.class);

        System.out.println(car);
        System.out.println(store);

        city.setName("Hasselt");
        city.setState("Limburg");
        city.setCountry("Belgium");
        city.setMayor(
                new Mayor("Antonio", "Carlos", 69)
        );

        System.out.println(city);
    }
}