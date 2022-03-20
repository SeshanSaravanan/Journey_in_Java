package com.Seshan;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {

        double principal, rate_of_interest, Time;
        double interest;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your principal: ");
        principal = scan.nextDouble();

        System.out.println("Enter your Rate of interest: ");
        rate_of_interest = scan.nextDouble();

        System.out.println("Enter your Time period: ");
        Time = scan.nextDouble();

        interest = (principal * rate_of_interest * Time)/100;

        System.out.println("The Simple interest is "+ interest);
    }

}

