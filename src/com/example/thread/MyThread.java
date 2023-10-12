package com.example.thread;

//1. Thread클래스 상속받는다.
public class MyThread extends Thread {
    private String str;

    public MyThread(String str){
        this.str = str;
    }
//   2. run()를 오버라이딩 한다.
// 동시에 실행시키고 싶은 코드를 작성한다.
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: "+name);

        for(int i = 0; i < 10; i++){
            System.out.print(str);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
