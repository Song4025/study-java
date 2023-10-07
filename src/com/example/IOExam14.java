package com.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class IOExam14 {
    public static void main(String[] args) throws Exception{

        byte[] array = new byte[2];
        array[0] = (byte)1;
        array[1] = (byte)2;
        
        ByteArrayInputStream in = new ByteArrayInputStream(array); // CharArrayReader, CharArrayWriter 도 있음. 바이트냐 문자냐에 차이
        int read1 = in.read();
        int read2 = in.read();
        int read3 = in.read(); // -1

        in.close();

        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);
    }
}
