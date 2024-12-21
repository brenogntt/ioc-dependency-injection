package com.brenogianotto.setterBasedDependencyInjection;

public class Store {
    private String name;
    private int registrationNumber;
    private Owner owner;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", owner=" + owner +
                '}';
    }
}
