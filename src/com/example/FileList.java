package com.example;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File f = new File("/tmp");

        printFiles(f);

    }

    private static void printFiles(File f) {
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(int i=0; i<files.length; i++){
//                System.out.println(files[i].getName());
                System.out.println("Dir:" + files[i]);
                printFiles(files[i]);
            }
        }else if(f.isFile()){
            System.out.println(f.getName());
        }else{
            System.out.println("else" + f.getName());
        }
    }
}
