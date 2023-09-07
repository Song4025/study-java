package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {

  public static void main(String[] args) throws Exception {
    // a라는 메소드가 있다.
    // 근데 클래스이름을 모르겠다.
    // 나중에 클래스 이름을 알려준다고 하니 일단. a()메소드가 실행되게 작성해라.

    // className 에 해당하는 클래스정보를 CLASSPATH에서 읽어들이고,
    // 그 정보를 clazz 가 참조하도록 한다.
    String className = "com.example.MyHome";

    Class clazz = Class.forName(className);
//  이렇게 하면 클래스가 가지고 있는 메소드 정보를 알아낼 수 있음.
    //    Method[] declearedMethods = clazz.getDeclaredMethods();
//    for(Method m : declearedMethods){
//      System.out.println(m.getName());
//    }
    Object o = clazz.newInstance();
    //  Object o = new Bus();와 같은 코드가 됨.
    //  Car b = (Car)o;
    //  b.a();

    Method m = clazz.getDeclaredMethod("a", null); // a 메소드정보를 가지고있는 메소드를 반환하라.
    m.invoke(o, null); // Object o가 참조하는 객체의 m 메소드를 실행해라.

  }

}
