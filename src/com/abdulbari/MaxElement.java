package com.abdulbari;

public class MaxElement {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,};
       int max=A[0];

        for(int i=0; i<=A.length; i++){
            if (A[i] > max) {

                max=A[i];

            }
        }
        System.out.println(max);
    }
}
