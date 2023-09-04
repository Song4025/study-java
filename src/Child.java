public class Child extends Parent{
  // field에 대한 오버라이딩
  public int i = 15;
  // method에 대한 오버라이딩
  public void printI() {
    System.out.println("child - printI(): " + i);
  }
}
