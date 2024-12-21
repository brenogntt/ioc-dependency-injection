package com.brenogianotto.setterBasedDependencyInjection;

public class Owner {
    private String name;
    private int id;

    public Owner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
