package com.example.util2;

public class StringExam {

  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    String str3 = new String("hello");
    String str4 = new String("hello");

    if(str1 == str2){
      System.out.println("str1 == str2");
    }
    else if(str1 == str3){
      System.out.println("str1 == str3");
    }
    else if(str3 == str4){
      System.out.println("str3 == str4");
    }
    // 이런 결과가 나온 이유
    // 자바에서 ==는 같은 것을 참조하느냐 이지 같은 값이냐 묻는게 아니기때문이다.
    // new 하는순간 메모리에 다른 객체값이 올라가 다른 것을 참조하게 되므로 str1 == str2만 truely한 값이다.
    // 또한 String은 new하지 않고 그냥 만드는것이 메모리를 적게 차지해서 좋다.

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
  }

}
