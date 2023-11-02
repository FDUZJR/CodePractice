package com.fudan._08call;

public class Demo2 {
   public static void main(String[] args) {
      int num = 1;
      doubleIntValue(num);                            //doubleIntValue方法中num=2

      System.out.println("main方法中num=" + num);      //main方法中num=1
   }

   private static void doubleIntValue(int num) {
      num *= 2;
      System.out.println("doubleIntValue方法中num=" + num);
   }
}
