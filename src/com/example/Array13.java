package com.example;

public class Array13 {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[3];
        array[0] = new ItemForArray(500, "버네너");
        array[1] = new ItemForArray(1200, "블루베리");
        array[2] = new ItemForArray(2000, "망고");

        for(ItemForArray item : array) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
