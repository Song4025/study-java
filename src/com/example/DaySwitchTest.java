package com.example;

public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        switch (day){
            case SUNDAY :
                System.out.println("일요일입니다.");
                break;
            case MONDAY:
                System.out.println("월요일입니다.");
                break;
            default :
                System.out.println("일,월요일을 제외한 요일");
        }
    }
}
