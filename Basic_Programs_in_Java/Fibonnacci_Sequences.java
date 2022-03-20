package com.Seshan;
import java.util.Scanner;

public class Fibonnacci_Sequences {
    public static void main(String[] args)
    {
     int a = 0, b = 1, c; //where a and b are the first number of the sequence
     int n; // No of elements to be printed

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements to be printed ");
        n = scan.nextInt();

        System.out.print("The fibonacci sequence is " + a +" " + b);
     for(int i = 2; i < n; i++)
     {
         c = a + b;
         System.out.print(" "+ c);

         a = b;
         b = c;
     }

    }

}
