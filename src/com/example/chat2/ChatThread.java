package com.example.chat2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatThread extends Thread{
    private String name;
    // 읽어들이기 위해 BufferedReader
    private BufferedReader br;
    // 쓰기위해서 PrintWriter
    private PrintWriter pw;
    private Socket socket;
    List<ChatThread> list;

    public ChatThread(Socket socket, List<ChatThread> list) throws Exception {
        this.socket = socket;
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.br = br;
        this.pw = pw;
        // 닉네임을 무조건 보내주기로 했기 때문에 readLine으로 name을 초기화해줌.
        this.name = br.readLine();
        this.list = list;
        // 자기 자신을 넣음 ChatClient를 넣음.
        this.list.add(this);
    }

    public void sendMessage(String msg){
        pw.println(msg);
        pw.flush();
    }

    @Override
    public void run() {
        // ChatThread는 사용자가 보낸 메세지를 읽어들여서 접속된 모든 클라이언트에게 메세지를 보냄. -> broadcast라고함.
        // 나를 제외한 모든 사용자에게 "00님이 연결되었습니다." 메세지를 보내야함.
        broadcast(name + " 님이 연결되었습니다.",false);
        // 현재 ChatThread를 제외하고 보냄.
        String line = null;
        try{
            while((line = br.readLine())!= null){
                if("/quit".equals(line)){
                    throw new RuntimeException("접속종료");
                }
                // 나를포함해서 ChatThread 에게 메세지를 보냄.
                broadcast(name + " : " + line,true);
            }
            // while은 null이면 완료가 되고 catch부분으로 가지않음 . finally로 보내는것이 맞음.
        }catch(Exception ex){

        }finally {
            broadcast(name + " 님의 연결이 끊어졌습니다.",false);
            this.list.remove(this);
            try{
                br.close();
            }catch(Exception ex){

            }
            try{
                pw.close();
            }catch(Exception ex){

            }
            try{
                socket.close();
            }catch(Exception ex){

            }
        }
    }
    private void broadcast(String msg, boolean includeMe){
        List<ChatThread> chatThreads = new ArrayList<>();
        for(int i = 0; i < this.list.size(); i++) {
            chatThreads.add(list.get(i));
        }

            // this.list를 복사해서 chatThreads에 넣어줌
            // 연결이 끊어질때 chatThreads 하나가 제거되도 동작이되도록 복제함.
            Collections.copy(chatThreads, this.list);
        try{
            for(int i = 0; i < chatThreads.size(); i++){
                ChatThread ct = chatThreads.get(i);
                if(!includeMe){ // 나를 포함하지 말아라.
                    if(ct == this){
                        continue;
                    }
                }
                ct.sendMessage(msg);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
