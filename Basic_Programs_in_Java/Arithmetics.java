package com.Seshan;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        double a, b, sum, dif, mul, div;
        char operator;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        a = scan.nextInt();

        System.out.println("Enter the operator: ");
        operator = scan.next().charAt(0);

        System.out.println("Enter your second number: ");
        b = scan.nextInt();

        if(operator == '*')
        {
            sum = a + b;
            System.out.println("SUM = "+sum);
        }
        else if (operator == '-')
        {
            dif = a - b;
            System.out.println("DIFFERENCE = " + dif);
        }
        else if(operator == '*')
        {
            mul = a * b;
            System.out.println("PRODUCT = " + mul);
        }
        else if(operator == '/')
        {
            div = a / b;
            System.out.println("QUOTIENT =" + div);
        }
        System.out.println("Program ended!!!!!!!!!!!!! ");
    }
}
