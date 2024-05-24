package com.ps;

import java.util.Scanner;

public class OrderScreen {
static Scanner scanner = new Scanner(System.in);
    public static void handleAddDrink() {
        // (2) Add Drink
            // Select Drink size and flavor
                // 3 sizes
                    // Small, Medium, Large
        System.out.println("Please select the size of the drink you would like:");
        System.out.println("(1) Small \n(2) Medium \n(3) Large");
        String drinkSizeInput;
        boolean running = true;
        while(running) {
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
        System.out.println("Please select one of the following flavors for your drink:");
        System.out.println("(1) Sproot\n(2) Fonta\n(3) Cream Soda\n(4) Snapple\n(5) Sweet Tea");
        String drinkFlavorInput;
        running = true;

        while(running) {
            drinkFlavorInput = scanner.next().trim();

            switch(drinkFlavorInput) {
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

                default:
                    System.out.println("Error, please select a listed flavor");
                    continue;

            }
            running = false;
        }
    }

    public static void handleAddChips() {
        // (3) Add Chips
            // Select chip type
        System.out.println("Please select the chips that you want:");
        System.out.println("(1) Cheetos\n(2) Funyons\n(3) Miss Vickie's\n(4) Deep River\n(5) North Fork");
        String chipsInput;
        boolean running = true;

        while (running) {
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

                default:
                    System.out.println("Error, please select one of the listed options");
                    continue;
            }
            running = false;
        }
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
