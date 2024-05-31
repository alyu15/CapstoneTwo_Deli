package com.ps;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    protected static Order newOrder;

    protected static void init(){
        newOrder = new Order();
    }
    public static void display() {

        System.out.println("Hello, welcome to Deli's Delicious Deli Sandwiches!");

        String homeMenuInput;
        Sandwich newSandwich = new Sandwich();

        do{

            System.out.println("What would you like to do?");
            System.out.println("(1) New Order");
            System.out.println("(0) Exit");
            homeMenuInput = scanner.next().trim();

            switch(homeMenuInput){
                case "1":
                    handleNewOrder(newSandwich);
                    break;

                case "0":
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Error, try again");
                    break;
            }

        }while(!homeMenuInput.equals("0"));
    }

    public static void handleNewOrder(Sandwich newSandwich) {

        init();

        String newOrderMenuInput;

        do {
            System.out.println("What would you like to do?");
            System.out.println("(1) Add Sandwich");
            System.out.println("(2) Add Drink");
            System.out.println("(3) Add Chips");
            System.out.println("(4) Add Sides");
            System.out.println("(5) Checkout");
            System.out.println("(0) Cancel Order");

            newOrderMenuInput = scanner.next().trim();

            switch(newOrderMenuInput) {
                case "1":
                    CreateSandwich.handleNewSandwich(newSandwich);
                    break;

                case "2":
                    handleAddDrink();
                    break;

                case "3":
                    handleAddChips();
                    break;

                case "4":
                    handleAddSides();
                    break;

                case "5":
                    handleCheckout(newSandwich);
                    return;

                case "0":
                    handleCancelOrder();
                    return;

                default:
                    System.out.println("Error, try again");
                    break;
            }

        }while(!newOrderMenuInput.equals("0"));
    }

    public static void handleAddDrink() {

        Drink drink = new Drink();
        String drinkFlavorInput;

        System.out.println("Please enter in one of the following flavors for your drink:");
        System.out.println("~ Sproot\n~ Fonta\n~ Creampops \n~ Snapple\n~ SweeTea");


        while (true) {
            drinkFlavorInput = scanner.next().trim();
            if (drinkFlavorInput.isEmpty()) {
                System.out.println("* Please enter in a listed flavor.");
            } else {
                drink.setFlavor(drinkFlavorInput);
                break;
            }
        }

        System.out.println("Please select the size of the drink you would like:");
        System.out.println("(1) Small \n(2) Medium \n(3) Large");
        String drinkSizeInput;

            drinkSizeInput = scanner.next().trim();

            switch (drinkSizeInput) {
                case "1":
                    drink.setSize("Small");
                    drink.setPrice(2.0);
                    break;

                case "2":
                    drink.setSize("Medium");
                    drink.setPrice(2.5);
                    break;

                case "3":
                    drink.setSize("Large");
                    drink.setPrice(3.0);
                    break;

                default:
                    System.out.println("Error, please select a size");

            }
            newOrder.addDrink(drink);

    }

    public static void handleAddChips() {

        Chip chip = new Chip();
        System.out.println("Please select the chips that you want:");
        System.out.println("(1) Cheetos\n(2) Funyons\n(3) Vickies\n(4) Rivers\n(5) Northies \n(0) Return to Order");
        String chipsInput;

            chipsInput = scanner.next().trim();

            switch(chipsInput) {
                case "1":
                    chip.setBrandName("Cheetos");
                    break;

                case "2":
                    chip.setBrandName("Funyons");
                    break;

                case "3":
                    chip.setBrandName("Vickies");
                    break;

                case "4":
                    chip.setBrandName("Rivers");
                    break;

                case "5":
                    chip.setBrandName("Northies");
                    break;

                case "0":
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Error, please select one of the listed options");
            }
            chip.setPrice(1.5);
            newOrder.addChip(chip);

    }

    public static void handleAddSides() {

        Sides sides = new Sides();
        System.out.println("Would you like any sides? Below are the options:");
        System.out.println("(1) Au Jus (2) Sauce (0) Return to Order");

        String sidesInput;

            sidesInput = scanner.next().trim();
            switch (sidesInput) {
                case "1":
                    sides.setName("au jus");
                    break;
                case "2":
                    sides.setName("sauce");
                    break;
                case "0":
                    System.out.println("Returning...");
                    break;
            }

    }

    public static void handleCheckout(Sandwich newSandwich) {

        newOrder.addSandwich(newSandwich);

        System.out.println(newOrder);
        System.out.println(newOrder.getPrice());

        ReceiptManager.saveReceipt(newOrder);

    }

    public static void handleCancelOrder() {
        newOrder = new Order();

    }

}
