package com.example.mian;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {

  public static void main(String[] args) {

    Controller c1 = new FirstController();
    c1.excute();
    // c1.init()은 사용하지 않는다 순서가 보장되지 않기때문에
  }
}
