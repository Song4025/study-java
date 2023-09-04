public class User {
  private String email;
  private String password;
  private String name;

  // 생성자가 하나라도 만들어지게 되면 기본생성자는 만들어지지않는다.
  public User(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public User(String email,String name, String password ) {
    this.email = email;
    this.password = password;
    this.name = name;
  }

  // 생성자 오버로딩할때 주의점: 오버로딩 매개변수 순서를 다 맞춰주는것이 필수
  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  // 생성자에서 넣어준 값을 리턴하는 기능만 가지고있는 것을 불변객체라함.
  // 불변객체는 언제사용하냐: 태어날때 어떤 값을 가지고 태어나게 한다음 외부에다 전달해야할 때


  // toString Generate
  @Override
  public String toString() {
    return "User {" +
        "email='" + email + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
