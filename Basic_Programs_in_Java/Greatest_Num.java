package com.Seshan;

import java.util.Scanner;

public class Greatest_Num {
    public static void main(String[] args) {

        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("The first number");
        num1 = scan.nextInt();

        System.out.println("The Second number");
        num2 = scan.nextInt();

        if(num1 > num2)
        {
            System.out.println("The number " + num1 +" is greater than " + num2);
        }
        else
        {
            System.out.println("The number" + num2 +" is greater than " + num1);
        }

    }
}
