package com.example;

public class GenericBox<T> {

//  T라는 클래스가 있는 것이 아닌, 정해지지않은 T라는 타입을 사용하겠다는 의미.
  private T t;

  public void add(T obj){
    this.t = obj;
  }

  public T get(){
    return this.t;
  }
}
