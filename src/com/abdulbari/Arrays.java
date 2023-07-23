package com.abdulbari;

public class Arrays {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum=0;
        for (int x:A)
         {sum= sum+x;
        }
        System.out.println("sum is "+ sum);
    }
}
