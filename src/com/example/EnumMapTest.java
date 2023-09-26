package com.example;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.SUNDAY, "일요일은 잠을잔다");
        emap.put(Day.FRIDAY, "불금!!");
        emap.put(Day.MONDAY, "월요병");

        System.out.println(emap.get(Day.MONDAY));
    }
}
