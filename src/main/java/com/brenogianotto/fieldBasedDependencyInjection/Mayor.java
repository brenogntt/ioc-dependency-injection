package com.brenogianotto.fieldBasedDependencyInjection;

public class Mayor {
    private String firstName;
    private String lastName;
    private int age;

    public Mayor() {}

    public Mayor(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mayor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
