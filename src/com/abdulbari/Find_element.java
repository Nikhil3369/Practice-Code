package com.abdulbari;

import java.util.Scanner;

public class Find_element {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 56, 71, 12, 45, 67, 34, 42};
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.println("Enter the key Element");
        key = sc.nextInt();

        for (int i = 0; i <= A.length; i++) {
            if (key == A[i]) {
                System.out.println("the Element is on " + i +" index");

            }

        }

    }
}




