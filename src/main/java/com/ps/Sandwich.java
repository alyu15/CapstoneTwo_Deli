package com.ps;

import java.util.ArrayList;

public class Sandwich extends Product{

    private String breadSize;
    private String breadType;
    private String premiumToppings;
    private boolean extraMeat = false;
    private String cheese;
    private boolean extraCheese = false;
    private ArrayList<String> regularToppings;
    private ArrayList<String> sauces;
    private boolean isToasted = false;

    public Sandwich(){};

    public Sandwich(String breadSize, String breadType, String premiumToppings,
                    String cheese, ArrayList<String> regularToppings, ArrayList<String> sauces) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.premiumToppings = premiumToppings;
        this.cheese = cheese;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
    }

    public String getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getPremiumToppings() {
        return premiumToppings;
    }

    public void setPremiumToppings(String premiumToppings) {
        this.premiumToppings = premiumToppings;
    }


    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public ArrayList<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(ArrayList<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        double premiumToppingCharge = 0;
        double extraMeatCharge = 0;
        double cheeseCharge = 0;
        double extraCheeseCharge = 0;
        if (getBreadSize() != null) {
            switch (getBreadSize()) {
                case "4\"":
                    totalPrice += 5.50;
                    premiumToppingCharge = 1.00;
                    extraMeatCharge = 0.50;
                    cheeseCharge = 0.75;
                    extraCheeseCharge = 0.30;
                    break;
                case "8\"":
                    totalPrice += 7.00;
                    premiumToppingCharge = 2.00;
                    extraMeatCharge = 1.00;
                    cheeseCharge = 1.50;
                    extraCheeseCharge = 0.60;
                    break;
                case "12\"":
                    totalPrice += 8.50;
                    premiumToppingCharge = 3.00;
                    extraMeatCharge = 1.50;
                    cheeseCharge = 2.25;
                    extraCheeseCharge = 0.90;
                    break;
            }
        }
        if (this.premiumToppings != null) {
            totalPrice += premiumToppingCharge;
        }
        if (this.cheese != null) {
            totalPrice += cheeseCharge;
        }
        if (extraMeat) {
            totalPrice += extraMeatCharge;
        }
        if (extraCheese) {
            totalPrice += extraCheeseCharge;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadSize='" + breadSize + '\'' +
                ", breadType='" + breadType + '\'' +
                ", premiumToppings=" + premiumToppings +
                ", extraMeat=" + extraMeat +
                ", cheese='" + cheese + '\'' +
                ", extraCheese=" + extraCheese +
                ", regularToppings=" + regularToppings +
                ", sauces=" + sauces +
                ", isToasted=" + isToasted +
                '}';
    }
}
