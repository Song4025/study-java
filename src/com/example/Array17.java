package com.example;

// java.leng 패키지의 클래스는 import 가 따로 필요하지않음.
import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {

        int[] array = {5,4,3,1,2};
        Arrays.sort(array);

//        for(int i : array){
//            System.out.println(i);
//        }

        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);

    }
}
