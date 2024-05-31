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

            buffwriter.write(order.toString());
            buffwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
