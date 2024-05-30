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

    public void checkOut() {

    }
}
