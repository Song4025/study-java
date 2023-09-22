package com.example;

// java.leng 패키지의 클래스는 import 가 따로 필요하지않음.
import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,6};
//        int[] array2 = {1,2,3,4,4};

        int compare = Arrays.compare(array1, array2);

        //compare 비교하는 메서드로 자주 사용
        System.out.println(compare);

    }
}
