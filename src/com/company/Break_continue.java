package com.company;

public class Break_continue {
    public static void main(String[] args) {
        //BREAK AND CONTINUE
        int i=0;
        while(true) {
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if (i > 5) {
                break;
            }

        }
    }
}
