package com.ps;

import java.util.Scanner;

public class CreateSandwich {
    static Scanner scanner = new Scanner(System.in);

    public static void handleNewSandwich(){

        String newSandwichInput;
        boolean running = true;
        while(running) {

            System.out.println("Please select one of the following options:");
            System.out.println("(1) Select type of bread");
            System.out.println("(2) Select size of bread");
            System.out.println("(3) Select Toppings (Regular)");
            System.out.println("(4) Select Meat Toppings (Premium) - Additional cost");
            System.out.println("(5) Select Cheese");
            System.out.println("(6) Select Sauce");
            System.out.println("(7) Toastin'");

            newSandwichInput = scanner.next().trim();

            switch(newSandwichInput){
                case "1":
                    handleSandwichType();
                    break;

                case "2":
                    handleSandwichSize();
                    break;

                case "3":
                    handleRegularToppings();
                    break;

                case "4":
                    handlePremiumToppings();
                    break;

                case "5":
                    handleSandwichCheese();
                    break;

                case "6":
                    handleSandwichSauce();
                    break;

                case "7":
                    break;

                default:
                    System.out.println("Error");
                    continue;

            }
            running = false;
        }
    }

    public static void handleSandwichType(){
        System.out.println("Please select the type of bread you would like:");
        System.out.println("(1) White\n(2) Wheat\n(3) Rye\n(4) Wrap");
        String sandwichBreadInput;

        boolean running = true;

        while(running) {

            sandwichBreadInput = scanner.next().trim();

            switch(sandwichBreadInput) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Error, please select one of the listed types of bread");
                    continue;
            }
            running = false;
        }
    }

    public static void handleSandwichSize() {

        System.out.println("Please select what size of sandwich you would like:");
        System.out.println("(1) 4\"\n(2) 8\"\n(3) 12\"");
        String sandwichSizeInput;
        boolean running = true;
        while(running){
            sandwichSizeInput = scanner.next().trim();

            switch(sandwichSizeInput) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                default:
                    System.out.println("Error, please choose one of the available sizes");
                    continue;
            }
            running = false;
        }
    }

    public static void handleRegularToppings() {

    }

    public static void handlePremiumToppings() {

    }

    public static void handleSandwichCheese() {

    }

    public static void handleSandwichSauce() {

    }
}
