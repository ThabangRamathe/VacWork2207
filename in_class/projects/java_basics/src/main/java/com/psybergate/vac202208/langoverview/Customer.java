package com.psybergate.vac202208.langoverview;

public class Customer extends Person {

  public static final int MAX_AGE = 100;

  private String name;

  private String surname;

  private int age;

  private int dateOfBirth;

  public Customer(String name, String surname, int age) {
    super("971019");
    this.name = name;
    this.surname = surname;
    if (age > MAX_AGE) {
      throw new IllegalArgumentException("age is invalid");
    }
    this.age = age;
  }

  public String getName() {
    int tax_rate = 0;
    int public1 = 1;
    {
      int tax = 15;
      System.out.println("tax = " + tax);
    }
    return name;
  }

  public boolean isYoung() {
    System.out.println("tax = " + name);
    return age < 100;
  }

  public static void main(String[] args) {
    Customer tasneem = new Customer("Tasneem", "DontKnow", 21);
    System.out.println("tasneem.isYoung() = " + tasneem.isYoung());
  }
}
