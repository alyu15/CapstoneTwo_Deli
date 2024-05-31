package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chip> chips;
    private List<Sides> sides;


    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.sides = new ArrayList<>();
    }


    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public void addChip(Chip chip) {
        this.chips.add(chip);
    }

    public void addSide(Sides side) {
        this.sides.add(side);
    }

    public double getPrice () {
        double orderTotal = 0;
        if(!this.sandwiches.isEmpty()) {
            for (Sandwich newSandwich: this.sandwiches) {
                orderTotal += newSandwich.calculatePrice();
            }
        }
        if(!this.drinks.isEmpty()) {
            for (Drink drink: this.drinks) {
                orderTotal += drink.calculatePrice();
            }
        }
        if(!this.chips.isEmpty()) {
            for(Chip chip: this.chips) {
                orderTotal += chip.calculatePrice();
            }
        }
        return orderTotal;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chip> getChips() {
        return chips;
    }

    public void setChips(List<Chip> chips) {
        this.chips = chips;
    }

    public List<Sides> getSides() {
        return sides;
    }

    public void setSides(List<Sides> sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                ", sides=" + sides +
                '}';
    }
}
