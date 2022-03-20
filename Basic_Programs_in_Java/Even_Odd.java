package com.Seshan;
import java.util.*;


public class Even_Odd {
    public static void main(String[] args){

        int num;

        System.out.println("Enter the number: ");

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The Given number is even");
        }
        else
        {
            System.out.println("The Given number is odd");
        }
    }
}
