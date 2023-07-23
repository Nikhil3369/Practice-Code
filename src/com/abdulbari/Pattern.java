package com.abdulbari;

public class Pattern {
   /* public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                count++;
            System.out.print(count+" ");
        }
            System.out.println("");
    }
}

    */

   public static void main(String[] args) {

        for(int i=1;i<=5;i++) {
            for (int j = 1;j<=5;j++) {
                if(i<=j)
                System.out.print(("* "));
                else
                    System.out.print(" ");
            }

            System.out.println("");
        }}}






