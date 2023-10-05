package com.example;

import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("tmp/hello.txt");
        int ch1 = in.read();
        System.out.println((char)ch1);
        int ch2 = in.read();
        System.out.println((char)ch2);
        int ch3 = in.read();
        System.out.println((char)ch3);
        int ch4 = in.read();
        System.out.println(ch4);

        in.close();
    }
}
