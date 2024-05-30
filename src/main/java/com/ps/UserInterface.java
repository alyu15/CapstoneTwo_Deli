package com.ps;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    private static Order newOrder;

    private static void init(){
        newOrder = new Order();
    }
    public static void display() {

        System.out.println("Hello, welcome to Deli's Delicious Deli Sandwiches!"); // need to modify

        String homeMenuInput;

        do{

            System.out.println("What would you like to do?");
            System.out.println("(1) New Order");
            System.out.println("(0) Exit");
            homeMenuInput = scanner.next().trim();

            switch(homeMenuInput){
                case "1":
                    handleNewOrder();
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

    public static void handleNewOrder() {

        init();

        String newOrderMenuInput;

        do {

            System.out.println("What would you like to do?");
            System.out.println("(1) Add Sandwich");
            System.out.println("(2) Add Drink");
            System.out.println("(3) Add Chips");
            System.out.println("(4) Checkout");
            System.out.println("(0) Cancel Order");

            newOrderMenuInput = scanner.next().trim();

            switch(newOrderMenuInput) {
                case "1":
                    CreateSandwich.handleNewSandwich();
                    break;

                case "2":
                    handleAddDrink();
                    break;

                case "3":
                    handleAddChips();
                    break;

                case "4":
                    handleCheckout();
                    break;

                case "0":
                    handleCancelOrder();
                    break;

                default:
                    System.out.println("Error, try again");
                    break;
            }

        }while(!newOrderMenuInput.equals("0"));
    }

    public static void handleAddDrink() {

        String drinkFlavorInput;

        System.out.println("Please enter in one of the following flavors for your drink:");
        System.out.println("~ Sproot\n~ Fonta\n~ Creampops \n~ Snapple\n~ SweeTea");


        while (true) {
            drinkFlavorInput = scanner.next().trim();
            if (drinkFlavorInput.isEmpty()) {
                System.out.println("* Please enter in a listed flavor.");
            } else {
                break;
            }
        }

        System.out.println("Please select the size of the drink you would like:");
        System.out.println("(1) Small \n(2) Medium \n(3) Large");
        String drinkSizeInput;
        boolean running = true;

        while (running) {
            drinkSizeInput = scanner.next().trim();

            switch (drinkSizeInput) {
                case "1":

                    break;

                case "2":
                    break;

                case "3":
                    break;

                default:
                    System.out.println("Error, please select a size");
                    continue;
            }
            running = false;

        }
    }

    public static void handleAddChips() {
        // (3) Add Chips
        // Select chip type
        System.out.println("Please select the chips that you want:");
        System.out.println("(1) Cheetos\n(2) Funyons\n(3) Vickies\n(4) Rivers\n(5) Northies \n(0) Return to Order");
        String chipsInput;

        do {
            chipsInput = scanner.next().trim();
            switch(chipsInput) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "0":
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Error, please select one of the listed options");
                    break;
            }
        } while(!chipsInput.equals("0"));
    }


    public static void handleCheckout() {
        // (4) Checkout - displays the order details and the price
        // Confirm
        // Creates the receipt file and goes back to home screen
    }

    public static void handleCancelOrder() {
        // (0) Cancel Order
        // Deletes the order and go back to the home screen
    }

}
