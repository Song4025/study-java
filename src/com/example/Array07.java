package com.example;

public class Array07 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.4, 3.5};

        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
//        System.out.println(array[3]);

        double[] array2 = new double[0];
        System.out.println(array2.length);
//        값을 가질 수 없는 배열
        System.out.println(array2[0]);

    }
}
