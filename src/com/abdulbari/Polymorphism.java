package com.abdulbari;

public class Polymorphism {
  static void show()
  {
      System.out.println("zero arg");
  }
  static void show(int x)
  {
      System.out.println("one arg");
  }
  static void show(int x, int y)
  {
      System.out.println("two arg");
  }
  static void show(int x, int y, int z)
  {
      System.out.println("three arg");
  }

    public static void main(String[] args) {
        {
            show();
            show(10);
            show(10,10);
            show(10,10,10);

        }
    }
}
