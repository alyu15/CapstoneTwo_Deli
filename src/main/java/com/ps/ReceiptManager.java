package com.ps;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public static void saveReceipt(Order order) {

        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
            String formattedDateTime = localDateTime.format(dateTimeFormatter);
            String receiptFile = formattedDateTime + ".txt";

            BufferedWriter buffwriter = new BufferedWriter(new FileWriter("src/main/Receipts/" + receiptFile));

            DateTimeFormatter neatFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
            String receiptDate = localDateTime.format((neatFormatter));
            String date = String.format("Date: %s\n", receiptDate);
            buffwriter.write(date);

            for(Sandwich sandwichOrder: order.getSandwiches()) {
                if(!order.getSandwiches().isEmpty()) {

                    String extraMeatChoice = sandwichOrder.isExtraMeat() ? "Yes" : "No";
                    String extraCheeseChoice = sandwichOrder.isExtraCheese() ? "Yes" : "No";
                    String toastedChoice = sandwichOrder.isToasted() ? "Yes" : "No";

                    String sandwichFormat = String.format("\nSandwich Bread Type: %s\nSandwich Size: %s\nPremium Toppings: %s\nExtra Meat: %s\n" +
                                    "Sandwich Cheese: %s\nExtra Cheese: %s\nRegular Toppings: %s\nSauces: %s, Toasted: %s",
                            sandwichOrder.getBreadType(),
                            sandwichOrder.getBreadSize(),
                            sandwichOrder.getPremiumToppings(),
                            extraMeatChoice,
                            sandwichOrder.getCheese(),
                            extraCheeseChoice,
                            sandwichOrder.getRegularToppings(),
                            sandwichOrder.getSauces(),
                            toastedChoice
                    );
                    buffwriter.write(sandwichFormat);
                }
            }
            for(Drink drinkOrder: order.getDrinks()) {
                if(!order.getDrinks().isEmpty()) {

                    String flavor = drinkOrder.getFlavor();
                    String size = drinkOrder.getSize();

                    String drinkFormat = String.format("\n\nDrink Flavor: %s\nDrink Size: %s",
                            flavor, size);
                    buffwriter.write(drinkFormat);
                }
            }
            for(Chip chipsOrder: order.getChips()) {
                if(!order.getChips().isEmpty()) {
                    String chipsFormat = String.format("\n\nChips: %s",
                            chipsOrder.getBrandName()
                    );
                    buffwriter.write(chipsFormat);
                }
            }
            for(Sides sidesorder: order.getSides()) {
                if(!order.getSides().isEmpty()) {
                    String sidesFormat = String.format("\n\nSides: %s",
                            sidesorder.getName());
                    buffwriter.write(sidesFormat);
                }
            }

            String totalPrice = String.format("\n\nTotal Price: $%.2f", order.getPrice());
            buffwriter.write(totalPrice);

            buffwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
