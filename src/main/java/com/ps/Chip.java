package com.ps;

public abstract class Chip extends Product {

    private String brandName;

    public Chip(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public double calculatePrice() {
        return 1.5f;
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
