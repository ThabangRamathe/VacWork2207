package com.psybergate.vac202208.langoverview;

public class OperatorBasics01 {

  public static void main(String... args) {
    int i = 1;
    int j = i + 2; // + = binary operator
    String s1 = 1 + "abc"; // concat operator
    System.out.println(s1);
    i++; // unary operator
    String a = 1 == 1 ? "true" : "false"; // ternary operator
    boolean b1 = true;
//    byte b2 = 245;
    char c1 = 'a';
    char c2 = 65535;
    Integer i1 = 0; // Integer i1 = Integer.valueOf(0);
    Integer i3 = null;
    Integer i2 = new Integer(0);
    String a1 = "abc";
    "abc".concat("def");
  }
}
