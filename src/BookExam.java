public class BookExam {

  public static void main(String[] args) {
    Book b1 = new Book();
    // b1.price = 100; // private 필드는 직접접근 불가
    // 필드에 접근하기 위한 메소드를 만든다 => setter, getter

    b1.setPrice(500);
    System.out.println(b1.getPrice());

    b1.setTitle("송현이는 졸리지만 공부를 해야해");
    System.out.println(b1.getTitle());
  }
}
