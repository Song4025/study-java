package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnlimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2,4,2));
        System.out.println(sum(3,1,2,3,4,2));

        List<Integer> intList = Arrays.asList(new Integer[] {1,2,3,4,5});

        System.out.println(sum(intList.toArray(new Integer[intList.size()])));
    }

    public static int sum(Integer... args){
        System.out.println("print1 메소드 - args의 길이" + args.length);
        int sum = 0;
        for(int i = 0; i< args.length; i++){
            sum+= args[i];
        }
        return sum;
    }

}
