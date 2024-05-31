package com.ps;

public class Chip extends Product {

    private String brandName;

    public Chip () {};
    public Chip(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    @Override
    public String toString() {
        return "Chip{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
