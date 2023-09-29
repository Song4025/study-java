package com.example;

import java.io.IOException;
import java.io.InputStream;
/*
1byte = 8bit
1byte가 표현할수 있는 값은 00000000 ~ 11111111
read()가 읽어들일 수 있는 정보는 00000000 ~ 11111111 중에 한개
1byte씩 파일을 읽어들인다. 100byte면 100번 읽어들인다.
근데 파일의 크기를 모른다. 그럼 언제까지 읽어들일까? -> 더이상 읽어들일것이 없을때까지 EOF -> 그러나 byte단위로는 표현할 수없음.
-> 자바개발자들 int 에 1byte값을 담자.       00000000 00000000 00000000 00000000
                                        00000000 00000000 00000000 11111111
EOF : -1
1 -->       00000000 00000000 00000000 00000001
1의 보수     11111111 11111111 11111111 11111110
2의 보수     11111111 11111111 11111111 11111111 : -1

byte단위를 읽어들이는 read()메소드가 int를 리턴하는가? -> EOF를 표현할 길이 없어서.

*/
public class InputStramExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try{
            int data = in.read();
        }catch(IOException ex){
            System.out.println("IO오류 : "+ ex);
        }finally {
            try{
                in.close();
            }catch(IOException ex2){
                System.out.println("IO오류2 : "+ ex2);
            }
        }
    }
}

// Q 키보드로부터 한줄씩 입력받아 화면에 출력하시오
// txt 파일로부터 한줄씩 입력받아 화면에 출력한다.
// 키보드로부터 한줄씩 입력받아 파일에 출력한다. (파일명은 아규먼트로 출력한다.)
// txt파일로부터 한줄씩 입력받아 다른파일에 한줄씩 출력한다.
