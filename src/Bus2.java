public class Bus2 extends Car2{
  public Bus2(){
    super("부모의기본생성자 이름");
    System.out.println("Bus2()의 기본생성자");
  }
  // 부모가 가지고 있는 추상메소드는 자식에서 반드시 구현을 해줘야함.
  @Override
  public void run() {
    System.out.println("버스는 후륜구동으로 달린다거");
  }
}
