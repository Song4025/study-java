package com.example;

// 인터페이스를 구현하기 되면 인터페이스 메소드를 오버라이딩 해줘야한다.
public class LottoMachineImpl implements LottoMachine{
  private Ball[] balls;

  @Override
  public void setBalls(Ball[] balls) {
    this.balls = balls;
  }

  // Math.random란? 결과는 실수로 0.0보단 크고 1.9보단 작은값이 나온다.
  @Override
  public void mix() {
    for(int i=0; i<10000; i++){
      int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
      int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
      if(x1 != x2){
        Ball tmp = balls[x1]; // 값을 치환할때는 같은 type의 임시변수가 필요하다.
        balls[x1] = balls[x2];
        balls[x2] = tmp;
      }
    }
  }

  @Override
  public Ball[] getBalls() {
    Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];
    for(int i=0; i<6; i++){
      result[i] = balls[i];
    }
    return result;
  }

}
