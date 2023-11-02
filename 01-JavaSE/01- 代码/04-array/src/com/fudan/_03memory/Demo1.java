package com.fudan._03memory;

public class Demo1 {
   public static void main(String[] args) {
      //局部变量
      int a = 1;
      m1();

   }

   private static void m1() {
      int a = 1;
      m2();
   }

   private static void m2() {
      int a = 1;
   }
}
