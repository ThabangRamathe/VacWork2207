package com.psybergate.vac202208.langoverview;

public class LoopBasics01 {

  public static void main(String[] args) {
    for (int i = 2; i <= 100;  ) {
      System.out.println("i = " + i);
      if (i > 50) break;
      i += 2;
    }
  }
}
