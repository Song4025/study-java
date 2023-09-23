package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 200));
        mySet.add(new MyData("hong", 700));
        mySet.add(new MyData("hong", 700));

        // 왜 set인데 동일한데이터를 두번 출력할까?
        // HashSet은 equals, HashCode라는 메소드로 값을 비교해주는데 현재 MyData에는 그런메소드가없어서
        // MyData의 부모인 Object로 비교하게 되는데 Object가 비교해주는것은 아무짝에도 쓸모가없다. -> 아무런 검사도안해줌
        // 결국 equals와 HashCode를 클래스에 오버라이딩해줘야만 중복값이 제거되는 의도대로 사용할 수 있다.

        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()){
            MyData myData = iterator.next();
        }
        for (MyData myData : mySet) {
            System.out.println(myData);
        }
    }
}

// 왜
class MyData{
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals!!!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode!");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
