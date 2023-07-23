package com.abdulbari;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Maxnumber {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a Key " );
       int key=sc.nextInt();


        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");

    }
}
