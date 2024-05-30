package com.ps;

public abstract class Product {

    private double price;

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
