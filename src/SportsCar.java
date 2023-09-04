public class SportsCar extends Car2 {
//  그냥 상속만 받으려 하면 에러가 난다 run()메소드를 구현하지 않았기 때문이다.
// 또 에러가나는이유 : 기본생성자가 없기때문 -> 기본생성자가 없으면 반드시 생성자를 만들어주고 부모의 생성자에다가 값을 전달해야한다.


  // 부모가 기본생성자가 없으므로 super호출
  public SportsCar(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("스포츠카는 사륜구동으로 달린다.");
  }
}
