import org.w3c.dom.ls.LSOutput;

public class UserExam {

  public static void main(String[] args) {
    User user = new User("tjjj@gmail.com", "너도와");

//    System.out.println(user.getEmail());
//    System.out.println(user.getName());
    System.out.println(user);

    User user2 = new User("sadfjkh@gamil.com", "양제주", "qwer1234");
    System.out.println(user2.getEmail());
    System.out.println(user2.getName());
    System.out.println(user2.getPassword());
  }

}
