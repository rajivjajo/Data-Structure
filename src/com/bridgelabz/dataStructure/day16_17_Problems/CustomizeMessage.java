package com.bridgelabz.dataStructure.day16_17_Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomizeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification. Thank you BridgeLabz 01/01/2016.";
        System.out.println("Enter first Name :\n");
        String fName = scanner.nextLine();
        // Replace <<name>> by first name
        message = message.replaceAll("<<name>>", fName);
        System.out.println("Enter full Name :\n");
        String fullName = scanner.nextLine();
        // Replace <<full name>> by full name
        message = message.replaceAll("<<full name>>", fullName);
        System.out.println("Enter Contact Num :\n");
        String num = scanner.nextLine();
        // Replace 91-xxxxxxxxxx by contact number
        message = message.replaceAll("91-xxxxxxxxxx", num);

        // Replace date in format XX/XX/XXXX by current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(new Date());
        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", currentDate);

        System.out.println("Modified Message: " + message);
    }
}
