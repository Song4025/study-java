package com.example;

import java.io.FileNotFoundException;

public class Exception06 {
    public static void main(String[] args) throws FileNotFoundException{
        int[] array = {4, 2};
        int[] value = new int[1];
        try{
            value[0] = array[0] / array[1];
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob.toString());
        }catch(ArithmeticException ae){
            System.out.println(ae.toString());
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
