package com.example;

import java.io.StringWriter;

public class IOExam15 {
    public static void main(String[] args) throws Exception{
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("wirkd");
        out.write("1111");

        String str = out.toString();
        System.out.println(str);
    }
}
