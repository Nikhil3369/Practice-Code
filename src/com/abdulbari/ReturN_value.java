package com.abdulbari;

public class ReturN_value {
    public static void main(String[] args) {
        System.out.println("Enter bike no.");
        String no= new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter the customer no.");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter the no. of days");
        int days= new java.util.Scanner(System.in).nextInt();
        System.out.println("Bike no"+"\t"+"Bike name"+"\t"+"days");
        System.out.println("  ");
        System.out.println(no+"\t");
        System.out.println(name+"\t\t");
        System.out.println(days+"\t");
    }
}
