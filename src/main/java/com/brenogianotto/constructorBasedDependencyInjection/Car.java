package com.brenogianotto.constructorBasedDependencyInjection;

public class Car {
    private String name;
    private String color;
    private Model model;

    public Car(String name, Model model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model=" + model +
                '}';
    }
}
