package com.Conditionals_Loops;

import java.util.*;

public class Average {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Total count of number to find the average of: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers: ");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;

        for(int val : arr){
            sum += val;
        }

        double average = sum/(double)n; // typecasting n from int to double for decimal division

        System.out.println("Average of n given numbers is "+average);

    }

}