package com.example;
/**
 B라는 사용자가 A가 만든 ExceptionObj1클래스를 이용한다면?
 두가지 단점이 발생.
 1. 0으로 값을 나눴을 때 엉뚱한 값이 나올 수 있다. -> 금액과 관련된 로직에 심각한 오류값을 초래할 수 있다.
 2. 사용자가 원하지 않는 메세지를 출력하게 한다.
 */

public class Exception01 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        try{
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌 순 없습니다.");
        }
    }
}

