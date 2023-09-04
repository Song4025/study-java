public class Car {
  private String name; // field는 가지는것.

  // 생성자는 메소드와 비슷하다.
  // return type이 없다. 클래스이름과 같아야한다.
  // ()안에 매개변수가 0개인 생성자를 default생성자(기본생성자)라고한다.
  // 생성자가 하나도 없으면 아무일도 안하는 기본생성자가 자체적으로 만들어진다.
  public Car(){
    System.out.println("생성자에서 생성된 자동차입니다.");
  }

  // 이름을 가지고 인스턴트를 생성하고 싶다면?
  public Car(String name){
    // 인스턴트 field의 name 을 매개변수명의 name값으로 변경시켜준다.
    this.name = name;
  }

  public void printName(){
    System.out.println("자동차이름은? : " + name);
  }

  public void run(){
    System.out.println("전륜구동으로 달린다");
  }

  @Override
  public String toString() {
    return "자동차는 달린다";
  }
}
