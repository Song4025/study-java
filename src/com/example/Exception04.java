package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception04 {
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("Exception04");
    }
}
