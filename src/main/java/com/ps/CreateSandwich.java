package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateSandwich {
    static Scanner scanner = new Scanner(System.in);

    public static void handleNewSandwich(Sandwich newSandwich){

        String newSandwichInput;

        do {

            System.out.println(newSandwich);

            System.out.println("Please select one of the following options:");
            System.out.println("(1) Select type of bread");
            System.out.println("(2) Select size of bread");
            System.out.println("(3) Select Toppings (Regular)");
            System.out.println("(4) Select Meat Toppings (Premium) - Additional cost");
            System.out.println("(5) Select Cheese");
            System.out.println("(6) Select Sauce");
            System.out.println("(7) Finish Sandwich");
            System.out.println("(0) Cancel Sandwich Creation");

            newSandwichInput = scanner.next().trim();

            switch(newSandwichInput){
                case "1":
                    handleSandwichType(newSandwich);
                    break;

                case "2":
                    handleSandwichSize(newSandwich);
                    break;

                case "3":
                    handleRegularToppings(newSandwich);
                    break;

                case "4":
                    handlePremiumToppings(newSandwich);
                    break;

                case "5":
                    handleSandwichCheese(newSandwich);
                    break;

                case "6":
                    handleSandwichSauce(newSandwich);
                    break;

                case "7":
                    handleSandwichExtras(newSandwich);
                    newSandwichInput = "-1";
                    break;

                case "0":
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Error");
                    break;

            }

        } while(!newSandwichInput.equals("0") && !newSandwichInput.equals("-1"));
    }

    public static void handleSandwichType(Sandwich newSandwich){

        System.out.println("Please select the type of bread you would like:");
        System.out.println("(1) White\n(2) Wheat\n(3) Rye\n(4) Wrap");
        String sandwichBreadInput;

        boolean running = true;

        while(running) {

            sandwichBreadInput = scanner.next().trim();

            switch(sandwichBreadInput) {
                case "1":
                    newSandwich.setBreadType("White");
                    break;

                case "2":
                    newSandwich.setBreadType("Wheat");
                    break;

                case "3":
                    newSandwich.setBreadType("Rye");
                    break;

                case "4":
                    newSandwich.setBreadType("Wrap");
                    break;

                default:
                    System.out.println("Error, please select one of the listed types of bread");
                    continue;
            }
            running = false;
        }
    }

    public static void handleSandwichSize(Sandwich newSandwich) {

        System.out.println("Please select what size of sandwich you would like:");
        System.out.println("(1) 4\"\n(2) 8\"\n(3) 12\"");
        String sandwichSizeInput;
        boolean running = true;
        while(running){
            sandwichSizeInput = scanner.next().trim();

            switch(sandwichSizeInput) {
                case "1":
                    newSandwich.setBreadSize("4\"");
                    break;

                case "2":
                    newSandwich.setBreadSize("8\"");
                    break;

                case "3":
                    newSandwich.setBreadSize("12\"");
                    break;

                default:
                    System.out.println("Error, please choose one of the available sizes");
                    continue;
            }
            running = false;
        }
    }

    public static void handleRegularToppings(Sandwich newSandwich) {
        System.out.println("Regular Toppings:");
        System.out.println("~ Lettuce\n~ Peppers\n~ Onions\n~ Tomatoes\n~ Jalepenos\n~ Cucumbers\n~ Pickles\n~ Guacamole\n~ Mushrooms");

        ArrayList<String> toppingsList = new ArrayList <>();

        while (true) {
            System.out.println("Please enter in the toppings you would like or \"done\" if you are finished");
            String toppingsInput = scanner.next().trim();

            if (!toppingsInput.equalsIgnoreCase("done")) {
                toppingsList.add(toppingsInput);
                newSandwich.setRegularToppings(toppingsList);
            } else if(toppingsInput.equalsIgnoreCase("done")) {
                break;
            }
        }
    }

    public static void handlePremiumToppings(Sandwich newSandwich) {

        System.out.println("Please select the type of meat you would like:");
        System.out.println("(1) Steak (2) Ham (3) Salami (4) Roast Beef (5) Chicken (6) Bacon" );
        String sandwichMeatInput;
        boolean running = true;
        while(running){
            sandwichMeatInput = scanner.next().trim();

            newSandwich.setPremiumToppings(sandwichMeatInput);

            switch(sandwichMeatInput) {
                case "1":
                    newSandwich.setPremiumToppings("Steak");
                    break;

                case "2":
                    newSandwich.setPremiumToppings("Ham");
                    break;

                case "3":
                    newSandwich.setPremiumToppings("Salami");
                    break;

                case "4":
                    newSandwich.setPremiumToppings("Roast Beef");
                    break;

                case "5":
                    newSandwich.setPremiumToppings("Chicken");
                    break;

                case "6":
                    newSandwich.setPremiumToppings("Bacon");
                    break;

                default:
                    System.out.println("Error, please choose one of the available meats");
                    continue;
            }
            running = false;
        }

    }

    public static void handleSandwichCheese(Sandwich newSandwich) {
        System.out.println("Please select the type of cheese you would like:");
        System.out.println("(1) American (2) Provolone (3) Cheddar (4) Swiss");
        String sandwichCheeseInput;
        boolean running = true;
        while(running){
            sandwichCheeseInput = scanner.next().trim();

            newSandwich.setCheese(sandwichCheeseInput);

            switch(sandwichCheeseInput) {
                case "1":
                    newSandwich.setCheese("American");
                    break;

                case "2":
                    newSandwich.setCheese("Provolone");
                    break;

                case "3":
                    newSandwich.setCheese("Cheddar");
                    break;

                case "4":
                    newSandwich.setCheese("Swiss");
                    break;

                default:
                    System.out.println("Error, please choose one of the available cheeses");
                    continue;
            }
            running = false;
        }

    }

    public static void handleSandwichSauce(Sandwich newSandwich) {

        System.out.println("Sauces:");
        System.out.println("~ Mayo\n~ Mustard\n~ Ketchup\n~ Ranch\n~ Thousand Island\n~ Vinaigrette");
        ArrayList<String> sauceList = new ArrayList <>();

        while(true) {
            System.out.println("Please enter in the sauces you would like or \"done\" if you are finished");
            String sauceInput = scanner.next().trim();

            if(!sauceInput.equalsIgnoreCase("done")) {
                sauceList.add(sauceInput);

                newSandwich.setSauces(sauceList);
            } else if(sauceInput.equalsIgnoreCase("done")) {
                break;
            }

        }

    }

    public static void handleSandwichExtras(Sandwich newSandwich) {

        System.out.println("Would you like extra meat on your sandwich for an additional cost?(yes/no)");
        String extraMeatInput = scanner.next().trim();

        if(extraMeatInput.equalsIgnoreCase("yes")) {
            newSandwich.setExtraMeat(true);
        }

        System.out.println("Would you like extra cheese on your sandwich for an additional cost?(yes/no)");
        String extraCheeseInput = scanner.next().trim();

        if(extraCheeseInput.equalsIgnoreCase("yes")) {
            newSandwich.setExtraCheese(true);
        }

        System.out.println("Would you like your sandwich toasted?(yes/no)");
        String toastedInput = scanner.next().trim();

        if(toastedInput.equalsIgnoreCase("yes")) {
            newSandwich.setToasted(true);
        }

    }

}
