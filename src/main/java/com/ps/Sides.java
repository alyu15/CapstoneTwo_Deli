package com.ps;

public class Sides extends Product{

    private String name;

    public Sides () {

    };

    public Sides(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Sides{" +
                "name='" + name + '\'' +
                '}';
    }
}
