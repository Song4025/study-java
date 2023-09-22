package com.example;

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {

//        if(args.length == 0){
//            System.out.println("사용법 : EmptyCommandLineArgumentExam 값 값 ....");
//            System.exit(0); // return 으로 변경가능.
//        }

// System.exit(0)를 이해하려면....
// Hello.java 파일 작성하고 javac Hello.java 명령을 실행했을때 성공하면 아무런 메세지도 나오지 않음.-> Unix 철학. 무소식이 희소식이다.
// Linux 도 Unix의 계열
// 작은 명령들을 조합해서 또다른 명령을 만든다.(쉘 스크립트 작성)
// 실행될때 진행여부를 알기위해 종료코드를 실행하게되는데 그때 사용하는게  System.exit(0);

        for(String arg: args){
            System.out.println(arg);
        }
// System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam.java
// java EmptyCommandLineArgumentExam a b c e hello
// java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c
