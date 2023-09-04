public class Book {
  private int price; // field
  private String title;

  // setter, getter 를 스프링에서는 프로퍼티라고함 프로퍼티 절대잊어선 안됨 프로퍼티
  // field 프로퍼티와 price 프로퍼티의 차이를 설명할 수 있어야 하는데
  // field 프로퍼티는 클래스가 가지는 것이고 price 프로퍼티는 setter, getter 메서드를 말하는것.
  public int getPrice() {
    return this.price; // this는 내 자신 인스턴트를 참조하는 예약어
  }

  public void setPrice(int price) { //지역변수
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
