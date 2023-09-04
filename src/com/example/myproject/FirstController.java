package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {

  @Override
  // 다른패키지일지라도 protected 해줌 -> 상속으로 인해 사용이 가능한 상태가 되기때문에
  protected void run() {
    System.out.println("별도로 동작하는 코드 111111");
  }
}
