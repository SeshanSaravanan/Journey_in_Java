package com.Seshan;
import java.util.Scanner;

public class Greeting_msg {
    public static void main(String[] args) {
        String name;

        System.out.println("Enter your name: ");

        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Hello "+ name +"." + "Hope your doing good");
    }
}
