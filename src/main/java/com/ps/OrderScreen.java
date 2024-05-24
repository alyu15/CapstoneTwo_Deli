package com.ps;

public class OrderScreen {
    public static void handleAddDrink() {
        // (2) Add Drink
            // Select Drink size and flavor
                // 3 sizes
                    // Small, Medium, Large
        System.out.println("Please select the size of the drink you would like:");
        System.out.println("(1) Small");
        System.out.println("(2) Medium");
        System.out.println("(3) Large");
    }

    public static void handleAddChips() {
        // (3) Add Chips
            // Select chip type
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
