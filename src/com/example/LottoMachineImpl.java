package com.example;

// 인터페이스를 구현하기 되면 인터페이스 메소드를 오버라이딩 해줘야한다.
public class LottoMachineImpl implements LottoMachine{

  @Override
  public void setBalls(Ball[] balls) {

  }

  @Override
  public void mix() {

  }

  @Override
  public Ball[] getBalls() {
    return new Ball[0];
  }

}
