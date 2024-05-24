package com.ps;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

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
                    OrderScreen.handleAddDrink();
                    break;

                case "3":
                    OrderScreen.handleAddChips();
                    break;

                case "4":
                    OrderScreen.handleCheckout();
                    break;

                case "0":
                    OrderScreen.handleCancelOrder();
                    break;

                default:
                    System.out.println("Error, try again");
                    break;
            }

        }while(!newOrderMenuInput.equals("0"));
    }

}
