package com.company;
import java.util.Scanner;



public class Calculate_Length {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int totalarea;
        System.out.println("Enter the length, breadth, height ");
        int lg = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
       totalarea = 2*( lg* breadth +lg * height+ breadth* height );
        System.out.println("totalarea "+totalarea );







    }

}
