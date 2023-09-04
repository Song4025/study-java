package com.example.fw;
/*
* Controller의 종류가 만약 여러개더라면?
* 초기화
* 실행
* 마무리
* */
public abstract class Controller {

  // final을 사용하면 다른클래스에서 오버라이딩 할수없게됨.
  protected final void init(){
    System.out.println("초기화를 실행합니다.");
  }
  // protected는 같은 패키지이거나 상속받았을 경우에만 사용이 가능.
  protected abstract void run();

  protected final void close(){
    System.out.println("코드를 마무리합니다.");
  }
  // 내가가지고 있는 메소드를 호출
  // 순서를 가지고있음
  // 이런메소드를 '템플릿 메소드'라고 함.
  public void excute(){
    // 초기화 this는 생략가능
    this.init();
    // 실행
    this.run();
    // 마무리
    this.close();
  }
}
