package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception {
        //절대 경로
        OutputStream out = new FileOutputStream("C:\\Users\\thdgu\\tmp");
        
        //상대 경로
        //OutputStream out = new FileOutputStream("tmp/helloio01.dat");

        out.write(1); // int 0000 0000   0000 0000   0000 0000   0000 0001;
        out.write(255);
        out.write(0); // int 0000 0000   0000 0000   0000 0000   0000 0000;
//      다 사용하고 나면  close해줘야함
        out.close();

    }
}
