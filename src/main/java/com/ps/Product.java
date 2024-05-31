package com.ps;

public abstract class Product {

    protected double price;

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
