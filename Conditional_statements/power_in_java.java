package com.Conditionals_Loops;

import java.util.Scanner;

public class power_in_java {
    public static void main(String[] args) {
        int base, exponent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base = scanner.nextInt();

        System.out.println("Enter the exponent value: ");
        exponent = scanner.nextInt();

        long result = 1;

        for(; exponent != 0; --exponent)
        {
            result *=base;
        }
        System.out.println("The Answer is " + result);
    }
}
