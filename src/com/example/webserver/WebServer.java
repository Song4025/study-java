package com.example.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        // 클라이언트가 접속할 때까지 대기. 대기할때 필요한 객체 : ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("1");


        try {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속하면 클라이언트와 통신하는 Socket이 반환.
                System.out.println("2");
                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }
    }
}

class ClientThread extends Thread{
    private Socket clientSocket;
    public ClientThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }



    public void run() {
        try{
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));
            // http://localhost:10000/hello
            // http://localhost:10000/hi
            // GET /hi HTTP/1.1
            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0)
                msg = "hello";
            else if (firstLine.indexOf("hi") >= 0)
                msg = "hi";
            System.out.println(firstLine);

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }
            // 비눚ㄹ까지 읽어들이면 끝.

            System.out.println("3 - 응답을 한다.");

            // GET /hi HTTP/1.1 의 요청이 왔을때 /hello의 대한 파일을 읽어서 출력한다.
            pw.println("HTTP/1.1 200 OK");
            pw.println("name: YANG");
            pw.println("email: thdgus@naver.com");
            pw.println();
            pw.println("<html>");
            pw.println(msg + " world!");
            pw.println(firstLine);
            pw.println("</html>");

            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}

