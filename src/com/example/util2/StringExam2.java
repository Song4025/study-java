package com.example.util2;

import java.util.Locale;

public class StringExam2 {

  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");

    if(str1.equals(str2)){ // 값이 같은지를 묻고있는 것.
      System.out.println("str1와 str2는 값이 같다");
    }

    String s = str1.toUpperCase();
    System.out.println(s);
    System.out.println(str1);

    String substring = str1.substring(3);
    System.out.println(substring);
    System.out.println(str1);
  }
}
