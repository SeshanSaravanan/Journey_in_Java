package com.Seshan;

import java.util.Scanner;

public class Armstrong_Num {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();

        for (int i = num1; i < num2; i++)
        {
            int check, rem, sum = 0;
            check = i;
            while(check != 0)
            {
                rem = check % 10;
                sum = sum+ (rem * rem * rem);
                check = check / 10;
            }

            if (sum == i )
            {
                System.out.println(" "+ i + "is an Armstrong Number");
            }

        }
    }
}
