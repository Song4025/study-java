package com.example;

public class Array10 {
    public static void main(String[] args) {
//       2차 배열 선언 - 두개 행에 열은 아직 모르는 배열
        int[][] array = new int[2][];
        array[0] = new int[2];
        array[1] = new int[3];

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for(int i = 0; i < array.length; i ++){
            for(int j = 0 ; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
