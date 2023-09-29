package com.example;

import java.io.File;
import java.io.IOException;

// c://temp
// /tmp
public class TempFile {
    public static void main(String[] args) {
        try{
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println("60초간 멈춰있다." + f.getAbsolutePath());
            try{
                Thread.sleep(60000); // 60초간 프로그램이 멈춰있다.
            } catch (InterruptedException e1){
                System.out.println(e1);
            }
            f.deleteOnExit(); //JVM이 종료될때 임시파일 자동 삭제.
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
