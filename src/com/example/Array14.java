package com.example;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {

        int[] copyFrom = {1,2,3};
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);
        
        if(copyFrom == copyTo){
            System.out.println("copyFrom == copyTo");
        } else {
            System.out.println("copyFrom != copyTo");
        }

        for(int c : copyTo){
            System.out.println(c);
        }
        System.out.println("---------------------------------------------");

        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);
        for(int d : copyTo2){
            System.out.println(d);
        }
        System.out.println("---------------------------------------------");

        int[] copyTo3 = copyFrom;
        for(int c : copyTo3){
            System.out.println(c);
        }

    }
}
