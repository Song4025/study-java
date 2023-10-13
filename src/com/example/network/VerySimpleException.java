package com.example.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleException {
    public static void main(String[] args) throws Exception{
        // port: 9090
        ServerSocket ss = new ServerSocket(9090);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 Socket을 반환한다.
        // 브라우저에서 http://127.0.0.1:9090
        // 2번째는 http://127.0.0.1:9090/board/hello.html
        System.out.println("클라이언트 접속을 기다립니다.");
        // Socket은 클라이언트(브라우저)와 통신할 수 있는 객체다.
        Socket socket = ss.accept();

        // Client와 읽고 쓸수 있는 InputStream, OutputStream이 반환된다.
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        // 빈줄을 만나면 while을 끝낸다.
        while(!(line = br.readLine()).equals("")){
            headers.add(line);
        }
        // 요청정보 읽기 끝
        System.out.println(firstLine);
        for(int i = 0; i < headers.size(); i++){
            System.out.println(headers.get(i));
        }

        // 서버에게 응답 메세지 보내기.
        // HTTP/1.1 200 OK <===상태메세지
        // 헤더 1
        // 헤더 2
        // 빈줄
        // 브라우저가 표시준 내용.
        pw.println("HTTP/1.1 200 OK");
        pw.println("name: Yang");
        pw.println("email: 111@naver.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>HELLO BABY~</h1>");
        pw.println("</html>");
        pw.close();

        // 필수
        ss.close();
        System.out.println("서버가 종료됩니다.");
    }
}
