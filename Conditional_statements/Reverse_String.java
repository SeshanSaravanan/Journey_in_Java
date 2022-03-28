package com.Conditionals_Loops;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        String mystring;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        mystring = scan.nextLine();

        String reversed = "";

        for(int i = mystring.length() - 1; i >= 0; i--)
        {
            reversed = reversed + mystring.charAt(i);
        }

        System.out.println("The reversed string is " + reversed);

    }
}
