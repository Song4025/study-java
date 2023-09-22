package com.example;
// 제네릭의 장점은 정해진 타입만 사용하도록 강제할 수 있다.
// 타입을 강제함으로써 컴파일할 때 잘못된 타입의 값이 저장되는 것을 막을 수 있다.

public class GenericBoxMain<T> {

  public static void main(String[] args) {
    GenericBox<String> genericBox = new GenericBox<>();
    genericBox.add("양송현");
    String str = genericBox.get();
    System.out.println(str.toUpperCase());

    // genericBox.add(new Integer(5)); // 컴파일 오류가 발생한다. String타입으로 정했기때문에

    GenericBox<Integer> intBox = new GenericBox<>();
    intBox.add(new Integer(6));
    Integer intValue = intBox.get();
    System.out.println(intValue);

    GenericBox<Object> objBox = new GenericBox<>();
    objBox.add("hello");
    // Obejct타입으로 했기때문에 꺼낼때 형변환은 해줘야함.
    String str2 = (String)objBox.get();
    System.out.println(str2);
  }
}
