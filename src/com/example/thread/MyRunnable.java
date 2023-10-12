package com.example.thread;

// Runnable 인터페이스를 구현한다.
public class MyRunnable implements Runnable{
    private String str;

    public MyRunnable(String str){
        this.str = str;
    }
    //   2. run()를 오버라이딩 한다.
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name);

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
