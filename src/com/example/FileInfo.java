package com.example;

import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("사용법: java FileInfo 파일이름");
            System.exit(0); // return과 같음
        } // if end

        File f = new File(args[0]);
        if(f.exists()){ // 파일이 존재할 경우
            System.out.println("length : " + f.length());
            System.out.println("canRead : " + f.canRead());
            System.out.println("canWrite : " + f.canWrite());
            System.out.println("getAbsolutePath : " + f.getAbsolutePath());

            try{
                System.out.println("getCanonicalPath :" + f.getCanonicalPath());
            }catch(IOException e){
                System.out.println(e);
            }
            System.out.println("getName" + f.getName());
            System.out.println("getName" + f.getName());
        }
    }
}
