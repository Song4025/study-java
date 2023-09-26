package com.example;

public class MyException extends RuntimeException{
    // 오류메세지나, 발생한 Exception을 감싼 결과로 내가 만든 Exception을 사용하고 싶을때가 많다.
    // 문자열을 만드는 생성자, Throwable을 만드는 생성자로 보통 많이 만들게됨.

    public MyException(String message) {
        super(message);
    }

    public MyException(Exception cause) {
        super(cause);
    }
}
