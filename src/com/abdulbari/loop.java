package com.abdulbari;

import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=n; i>=1; i--)
        {
         fact = fact*i;
        }
        System.out.println("Fact="+fact);

    }
}
