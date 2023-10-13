package com.example.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try{
            InetAddress ia = InetAddress.getLocalHost(); // 내 컴퓨터의 IP정보를 알려줌.
            System.out.println(ia.getHostAddress());
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }

        try{
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com"); // 내 컴퓨터의 IP정보를 알려줌.
            for(InetAddress ia : iaArray){
                System.out.println(ia.getHostAddress());
            }
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }
    }
}
