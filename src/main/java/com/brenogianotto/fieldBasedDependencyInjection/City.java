package com.brenogianotto.fieldBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class City {

    // Field-Based Dependency Injection
    @Autowired
    private Mayor mayor;
    private String name;
    private String state;
    private String country;

    public void setMayor(Mayor mayor) {
        this.mayor = mayor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "mayor=" + mayor +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
