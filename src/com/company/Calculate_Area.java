package com.company;
import java.util.Scanner;
public class Calculate_Area {
    public static void main(String[] args) {


        System.out.println("Enter the base and height ");
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
       float height =sc.nextFloat();
       float area= base* height/2;
        System.out.println("tha area is " +area);


    }
}
