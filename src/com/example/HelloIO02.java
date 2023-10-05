package com.example;

import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("tmp/helloio01.dat");
        // 이 파일로부터 한 byte를 읽어들임
        int i1 = in.read();
        System.out.println(i1); // 1

        int i2 = in.read();
        System.out.println(i2); // 255

        int i3 = in.read();
        System.out.println(i3); // 0

        int i4 = in.read();
        System.out.println(i4); // 더이상 읽어들일 게 없음 -1 (파일의끝) EOF

        int buf = -1;
        while((buf = in.read()) != -1){
            System.out.println(buf);
        }
        in.close();
    }
}
