package com.example;

/*

인터페이스: 기능들의 목록을 가지고있음.
메소드 선어만 되어있음.

인터페이스의 모든 필드는 final 이어야만 하고 모든 메소드는 abstract 여야만 한다.
생략해도 자동으로 자바7 이후, 그렇게 인식한다.

* 1. 1-45까지 적힌 공을 로또 기계에 넣는다.
* 2. 로또 기계에 있는 공들을 섞는다.
* 3. 섞인 공중에서 6개를 꺼낸다. (보너스볼은 제외한다.)
* */

public interface LottoMachine {
  int MAX_BALL_COUNT = 45;
  int RETURN_BALL_COUNT = 6;
  public void setBalls(Ball[] balls); // ball 45개를 받을예정
  public void mix(); // 자기가 가지고 있는 ball들을 섞는다.
  public Ball[] getBalls(); // 6개의 Ball을 반환한다.
}
