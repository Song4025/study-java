public class Car2Exam02 {
  public static void main(String[] args) {
//    Car2 c = new Car2(); 추상화된 클래스는 인스턴트로 만들수없음.
//    Bus2 b = new Bus2();
//    b.run();
//
//    SportsCar s1 = new SportsCar("붕붕이");
//    s1.run();

    Car2[] array = new Car2[2];
    array[0] = new Bus2();
    array[1] = new SportsCar("붕붕이");

    for(Car2 c2 : array){
      c2.run();
    }
  }
}
