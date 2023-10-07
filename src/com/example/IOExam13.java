package com.example;

import java.io.ByteArrayOutputStream;

public class IOExam13 {
    public static void main(String[] args) throws Exception{

        int data1 = 1;
        int data2 = 2;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1); // data의 마지막 1byte저장한다.
        out.write(data2);
        out.close();

        byte[] array = out.toByteArray();
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);

    }
}
