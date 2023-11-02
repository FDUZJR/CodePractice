package com.fudan._08call;

/*
方法的传参
*/
public class Demo1 {
   public static void main(String[] args) {
      int a = 1;
      test(a);                                     //test方法中，a=2

      //输出a的值
      System.out.println("main方法中，a=" + a);     //main方法中，a=1
   }

   private static void test(int a) {
      a += 1;
      System.out.println("test方法中，a=" + a);
   }
}
