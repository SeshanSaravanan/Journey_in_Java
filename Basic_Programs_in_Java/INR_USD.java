package com.Seshan;

import java.util.Scanner;

public class INR_USD {
    public static void main(String[] args) {

        float rupees;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your currency in rupees: ");
        rupees = scan.nextFloat();

        float dollars = rupees / 70;
        System.out.print("Your currency in dollars = ");
        System.out.println(dollars + "Dollars");
    }
}
