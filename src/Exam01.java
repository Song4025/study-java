public class Exam01 {
  public static void main(String[] args) {
    Child c1 = new Child();
    System.out.println(c1.i);
    c1.printI();

    Parent p1 = new Parent();
    System.out.println(p1.i);
    p1.printI();

    Parent p2 = new Child(); // 이문법이 오류가 나지 않는다는 것은 Child는 Parent의 후손이다. 혹은 자식이거나
    System.out.println(p2.i);
    p2.printI();
    p2.printII();
  }
}
