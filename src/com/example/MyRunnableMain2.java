package com.example;

public class MyRunnableMain2 {

  public static void main(String[] args) {

//    MyRunnable myRunnable = new MyRunnable() {
//      @Override
//      public void run() {
//        System.out.println("이름없이받아서 오버라이딩 시킨 메소드");
//      }
//    };

//  사용 용도: 재사용하지 않을거같을때
    RunnableExecute runnableExecute = new RunnableExecute();
    System.out.println("람다를 사용할때는 메소드가 딱 하나만 있어야함.");
    runnableExecute.execute(() -> {
      System.out.println("이름없이받아서 오버라이딩 시킨 메소드");
    });
    System.out.println("나중에 스트림API와 엮여서 쓰게되면 매우 편리하다");

  }
}
