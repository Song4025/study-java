package com.example;

/*
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
