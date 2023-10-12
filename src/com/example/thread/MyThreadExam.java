package com.example.thread;

public class MyThreadExam {
    public static void main(String[] args) {
//        String name = Thread.currentThread().getName();
//        System.out.println("Thread name: "+name);
        System.out.print("program start");

        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        // thread는 start()메소드로 실행한다.
        mt1.start();
        mt2.start();

        System.out.println("program end");
    }
}
