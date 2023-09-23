package com.example;

import java.util.*;

public class ListExam02 {
    public static void main(String[] args) {
        // 자료구조객체들은 제네릭을 사용하지 않으면  Object타입을 저장합니다.
        List<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }

    }


}
