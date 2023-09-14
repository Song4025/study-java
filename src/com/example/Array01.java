package com.example;

public class Array01 {
    public static void main(String[] args) {
        // 예제 1
        // 배열 선언
        int[] array1;
        int array2[];
        int array3[];

        //여기 초기화 하는 부분을 진행하지않으면 null point exception떨어짐
        array1 = new int[5];
        array2 = new int[5];
        // 0개로도 만들수있다.
        array3 = new int[0];

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

//        예제 2
//        이렇게 선언하면 두개의 참조타입이다 int로 됨
        int[] array4, array5;
//        이렇게 선언하면 array6만 배열이라는 말
        int array6[], array7;
    }
}
