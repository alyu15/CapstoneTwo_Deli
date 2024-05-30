package com.ps;

public abstract class Drink extends Product{

    private String flavor;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public double calculatePrice() {

        if(this.size.equalsIgnoreCase("small")) {
            return 2.0f;
        } else if(this.size.equalsIgnoreCase("medium")) {
            return 2.5f;
        } else { return 3.0f;
        }
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
        return "Drink{" +
                "flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
