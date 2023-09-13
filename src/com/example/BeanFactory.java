package com.example;

public class BeanFactory {

  // 2. 자기자신 인스턴트를 참조하는 static 한 필드를 선언한다.
  private static BeanFactory instance = new BeanFactory();
  // 1. private 생성자를 만든다. 외부에서 인스턴트를 생성하지 못한다.
  private BeanFactory(){

  }
  // 3. 2에서 생성한 인스턴트를 반환하는 static한 메소드를 만든다.
  public static BeanFactory getInstance(){
    return instance;
  }

  // 팩토리 메소드
  public Bus getBus(){
    return new Bus();
  }

}
