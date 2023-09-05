package com.example;
// ball은 만들어졌을 때 특정숫자를 가지게 되고 그 숫자는 절대 변하면 안됨 -> 불변클래스
public class Ball {
  private int number;
  // 불변클래스를 위해 생성자 만듦 : 이볼은 처음부터 숫자를 가지고 태어나게 한다.
  public Ball(int number){
    this.number = number;
  }

  // 외부에서 이 공의 숫자값을 알기 위해 getter 메소드를 생성해준다.
  public int getNumber() {
    return number;
  }
}
