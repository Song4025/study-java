package com.example;

public class LottoMachineMain {

  public static void main(String[] args) {

  // Ball b1 = new Ball();
  // Ball b2 = new Ball();
  //    .....
  // Ball b45 = new Ball();
  // 이렇게 하면 변수가 45개 필요하니 배열로 만든다. 아래의 뜻은 Balls인스턴스를 45개 만들수 있는 배열이 만들어진다는 뜻.
  Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
  for(int i=0; i<45; i++){
    balls[i] = new Ball(i+1);
  }

    // 인터페이스는 인스턴트가 될 수 없고 impl은 인터페이스를 구현한 클래스라서 인스턴트가 될 수 있다.
    // LottoMachine 인스턴트가 생성된다.
    LottoMachine lottoMachine = new LottoMachineImpl();
    lottoMachine.setBalls(balls);
    lottoMachine.mix();
    lottoMachine.getBalls();
    Ball[] result = lottoMachine.getBalls();

    for(int i=0; i<result.length; i++){
      System.out.println(result[i].getNumber());
    }
  }
}
