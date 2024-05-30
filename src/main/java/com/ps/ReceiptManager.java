package com.ps;

import java.io.*;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public static void saveReceipt(String receipt) {

        try {

            DateTimeFormatter dateTimeFormatted = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
            BufferedWriter buffwriter = new BufferedWriter(new FileWriter("src/main/Receipts/" + dateTimeFormatted + ".txt"));
            buffwriter.write(receipt);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
