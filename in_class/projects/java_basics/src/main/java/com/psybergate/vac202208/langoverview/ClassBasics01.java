package com.psybergate.vac202208.langoverview;

import java.util.ArrayList;
import java.util.List;

public class ClassBasics01 {

  public static void main(String[] args) {
    Hello aaqib = new Hello("aaqib");
    Hello aaqib1 = new Hello();
    new Goodbye();
    List l1 = new ArrayList<>();
    l1.add(new Integer(0));
    l1.add(new Boolean(true));
    l1.add(100); // l1.add(Integer.valueOf(100));
  }
}

class Hello {

  public Hello() {
  }

  public Hello(String name) {
    System.out.println("hello " + name);
  }
}

class Goodbye {

//  public Goodbye() {
//  }
}
