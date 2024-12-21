package com.brenogianotto.constructorBasedDependencyInjection;

public class Model {
    private int id;
    private String name;
    private String producer;

    public Model(int id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
