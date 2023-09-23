package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShiffleExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kim");
        list.add("lee");
        list.add("hong");

        Collections.shuffle(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
