package com.example;

public class Array05 {
    public static void main(String[] args) {
        ItemForArray[] array1 = new ItemForArray[3];
        array1[0] = new ItemForArray(500, "사과");
        array1[1] = new ItemForArray(800, "버네너");
        array1[2] = new ItemForArray(8200, "수박");

        ItemForArray[] array2 = new ItemForArray[]{
            new ItemForArray(500, "사과"), new ItemForArray(800, "버네너"), new ItemForArray(8200, "수박")
        };
        ItemForArray[] array3 = {
            new ItemForArray(500, "사과"), new ItemForArray(800, "버네너"), new ItemForArray(8200, "수박")
        };

        System.out.println(array1[0].getPrice());
        System.out.println(array1[0].getName());
        System.out.println(array1[1].getPrice());
        System.out.println(array1[1].getName());
        System.out.println(array1[2].getPrice());
        System.out.println(array1[2].getName());
    }
}
