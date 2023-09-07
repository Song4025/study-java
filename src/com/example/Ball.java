package com.example;
// 생성자에서 어떤 초기값을 넘겨서 필드를 초기화해주고 값을 리턴만 하게 해주는 클래스를 불변객체라고함.
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
