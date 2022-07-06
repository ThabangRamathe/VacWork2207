package com.psybergate.vac202208.langoverview;

public class OOBasics01 {

  public static void main(String[] args) {
    Customer c1 = new Customer("abc", "def", 10);
    c1.toString();
    c1.getIdNum();
    c1.getName();
    System.out.println("c1.equals(\"abc\") = " + c1.equals("abc"));
    Person p1 = new Customer("abc", "def", 10);
    Object o1 = new Customer("abc", "def", 10);
    p1.toString();
    p1.getIdNum();
    TypeBasics01.simpleJavaBuiltInClasses();
  }
}
