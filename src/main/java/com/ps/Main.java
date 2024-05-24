package com.ps;

public class Main {
    public static void main(String[] args) {

        // Home Screen
            // (1) New Order - creates a new order
            // (0) Exit - exits application
        // Order Screen
            // (1) Add Sandwich
                // Select your bread
                    // 4 types of bread
                        // White, wheat, rye, or wrap
                // Select sandwich size
                    // 3 sizes
                        // 4", 8", 12"
                // Toppings - the user should be able to add extras of each topping
                    // Regular toppings
                        // Lettuce
                        // Peppers
                        // Onions
                        // Tomatoes
                        // Jalepenos
                        // Cucumbers
                        // Pickles
                        // Guacamole
                        // Mushrooms
                    // Premium toppings - additional cost
                        // Meat
                            // Steak
                            // Ham
                            // Salami
                            // Roast Beef
                            // Chicken
                            // Bacon
                        // Cheese
                            // American
                            // Provolone
                            // Cheddar
                            // Swiss
                    // Select sauces
                        // Mayo
                        // Mustard
                        // Ketchup
                        // Ranch
                        // Thousand Islands
                        // Vinaigrette
                    // Toasted?
            // (2) Add Drink
                // Select Drink size and flavor
                    // 3 sizes
                        // Small, Medium, Large
            // (3) Add Chips
                // Select chip type
            // (4) Checkout - displays the order details and the price
                // Confirm
                    // Creates the receipt file and goes back to home screen
                // Cancel
                    // Deletes the order and goes back to the home screen
            // (0) Cancel Order
                // Deletes the order and go back to the home screen

        // A lot of if statements
        // Need to be able to keep track of all the data somehow - use OOP
        // Name classes appropriately
        // Checkout = read the file
        // Simple interface
        // Just keep track of their order first then calculate total price at the end
        // Asking them for input but limiting their options
            // Similar to Car Dealership
        // Every single receipt will be its own file
            // Format of yyyymmDD-HHmmSS.txt
        // Bonus feature options
            // Keeping track of calories
            // Can add discount options
            // Add an admin screen
                // Filter then be able to view receipts
            // Maybe have a folder just for receipts
        // At most maybe 5 classes
            // 1 should be an interface class
        UserInterface.display();

    }
}