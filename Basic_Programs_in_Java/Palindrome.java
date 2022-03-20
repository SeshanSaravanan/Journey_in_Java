package com.Seshan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string: ");
        word = scan.nextLine();

        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();

        String reversed = buffer.toString();

        if(word.equalsIgnoreCase(reversed))
        {
            System.out.println("The given string is a palindrome");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
        }
    }
}
