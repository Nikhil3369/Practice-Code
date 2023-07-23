package com.company;

import java.util.Scanner;

public class Condition_Statement {
    public static void main(String[] args) {
        //condition statement
        Scanner sc = new Scanner(System.in);
        // pen = 10; , book = 40;
        int cash = sc.nextInt();
        if (cash < 10)
        {
            System.out.println("they can't buy anything");
            System.out.println("get more cash");
        }
        else if (cash > 10 && cash < 50)
        {
            System.out.println("they can buy pen");
            System.out.println("can get one thing");
        }
        else if(cash > 50)
        {
            System.out.println("they can buy anything");

        }
    }
}

