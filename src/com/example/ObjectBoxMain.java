package com.example;

public class ObjectBoxMain {

  // 단점은 꺼낼때마다 형변환을 시켜줘서 꺼내줘야함.
  // 단점2 범용적이지가 않음. 실재로 사용할 때는 특정 타입을 사용해야 할때가 많음.
  // -> 타입을 지정할 필요가 없으며 범용적인 클래스를 만들고 싶다. -> 제네릭이란 문법으로 해소가능.
  public static void main(String[] args) {
    ObjectBox box = new ObjectBox();
    box.set("kim");
//    get메서드가 리턴으로 object를 반환하기 때문에 꺼낼때 형변환 시켜줘야함.
    String str = (String)box.get();
//     toUpperCase 사용하면 대문자로 변경됨.
    System.out.println(str.toUpperCase());

    box.set(new Integer(5));
    Integer i = (Integer)box.get();
    System.out.println(i.intValue());
  }
}
