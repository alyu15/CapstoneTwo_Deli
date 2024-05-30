package com.ps;

import java.util.Arrays;


public abstract class Sandwich extends Product{

    private String breadSize;
    private String breadType;
    private String[] premiumToppings;
    private boolean extraMeat = false;
    private String[] cheese;
    private boolean extraCheese = false;
    private String[] regularToppings;
    private String[] sauces;
    private boolean isToasted = false;

    public Sandwich(String breadSize, String breadType, String[] premiumToppings,
                    String[] cheese, String[] regularToppings, String[] sauces) {

        this.breadSize = breadSize;
        this.breadType = breadType;
        this.premiumToppings = new String[] {"steak", "ham", "salami", "roast beef", "chicken", "bacon"};
        this.cheese = new String[] {"american", "provolone", "cheddar", "swiss"};
        this.regularToppings = new String[] {"lettuce", "peppers", "onions", "tomatoes", "jalepenos", "cucumbers", "pickles", "guacamole", "mushrooms"};
        this.sauces = new String[] {"mayo", "mustard", "ketchup", "ranch", "thousand islands", "vinaigrette"};
    }



    @Override
    public double calculatePrice() {
        return 0;
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

    public String[] getPremiumToppings() {
        return premiumToppings;
    }

    public void setPremiumToppings(String[] premiumToppings) {
        this.premiumToppings = premiumToppings;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String[] getCheese() {
        return cheese;
    }

    public void setCheese(String[] cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String[] getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(String[] regularToppings) {
        this.regularToppings = regularToppings;
    }

    public String[] getSauces() {
        return sauces;
    }

    public void setSauces(String[] sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadSize='" + breadSize + '\'' +
                ", breadType=" + breadType +
                ", premiumToppings=" + Arrays.toString(premiumToppings) +
                ", extraMeat=" + extraMeat +
                ", cheese=" + Arrays.toString(cheese) +
                ", extraCheese=" + extraCheese +
                ", regularToppings=" + Arrays.toString(regularToppings) +
                ", sauces=" + Arrays.toString(sauces) +
                ", isToasted=" + isToasted +
                '}';
    }
}
