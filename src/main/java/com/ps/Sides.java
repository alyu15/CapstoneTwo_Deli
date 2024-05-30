package com.ps;

import java.util.Arrays;

public abstract class Sides extends Product{

    private String[] name;

    public Sides(String name) {
        this.name = new String[] {"au jus", "sauce"};
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sides{" +
                "name=" + Arrays.toString(name) +
                '}';
    }
}
