package com.ps;

public class Drink extends Product{

    private String flavor;
    private String size;

    public Drink() {
    };

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink" +
                "\n============================" +
                "\nFlavor = '" + flavor + '\'' +
                "Size = '" + size +
                '\n';
    }
}
