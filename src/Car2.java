public abstract class Car2 {
  public Car2(String name) {
    System.out.println("Car2의 기본생성자");
  }

  // 추상메소드를 구현한 사람은 run()메소드를 필요로 할거라 생각함.
  // 그러나 run()메소드는 자동차마다 다르게 구현되어야 할거같음. ex)후륜구동 전륜구동 사륜구동
  // 추상클래스를 만들고 선언만 해놓음.
  // 그러면 Bus2에서는 Car2를 상속받았을 경우에 반드시 run메소드를 구현해줘야함.

  public abstract void run();

}
