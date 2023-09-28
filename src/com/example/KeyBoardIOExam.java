package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyBoardIOExam {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // keyBoard : System.in (InputStream - 주인공)
        // outScreen : System.out (OutputStream - 주인공)
        // 키보드: 문자를 입력받는다는것 - char
        // char단위 입출력 : Reader or Writer
        // 한줄읽기라는 기능: BufferedReader(장식이라 주인공없이 쓸 수없음.) - ReadLine
        //                  더이상 읽어들일게 없으면(EOF) null을 반환
        // 한줄쓰는것: PrintStream, PrintWriter

        // BufferedReader 는 사용할수없음
        // CharReader - 문자로부터 읽어들인다.
        // FilterReader - 장식. Reader를 넣어줘야함.
        // InputStreamReader(InputStream in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while((line = br.readLine())!= null){
            System.out.println("읽어들인값 : " + line);
        }
    }
}
