package com.example;
import java.util.*;

public class MapExam02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        // map.KeySet 하게되면 map이가지고 있는 모든 키들을 접근할 수 있는 Set객체가 나옴
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }

    }
}
