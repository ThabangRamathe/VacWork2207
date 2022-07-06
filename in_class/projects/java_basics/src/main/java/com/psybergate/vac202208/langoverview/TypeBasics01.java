package com.psybergate.vac202208.langoverview;

import java.time.LocalDate;

public class TypeBasics01 {

  public static void main(String[] args) {
//    primitives();
//    arrayPrimitives();
    simpleJavaBuiltInClasses();
  }

  private static void primitives() {
    byte b1 = 127;
    short s1 = 128;
    int i = 10;
    long l1 = 10;
    float f1 = 1.23f;
    double d1 = 1.23;
    boolean i1 = true;
    char c1 = 'a';
    char c2 = 0x61;
    System.out.println("c2 = " + c2);
    int i3 = 1 + 2;
  }

  private static void arrayPrimitives() {
    int[] nums = new int[5];
    nums.toString();
  }

  public static void simpleJavaBuiltInClasses() {
    String s1 = "abc";
    "abc".concat("def");
    String s2 = new String("abc");
    Customer c2 = new Customer("chris", "smith", 3);
    s1.concat("def");
    LocalDate today = LocalDate.now();
    System.out.println("today = " + today);
  }
}
