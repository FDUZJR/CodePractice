package com.fudan1;

import static com.fudan._03detail.Demo3.m1;
import static com.fudan._03detail.Demo3.m2;

public class Demo2 {
   public static void main(String[] args) {
      System.out.println("aaa");
      m1();
      System.out.println("bbb");
      m2();
   }
   private static void m1(){
      for (int i = 0; i < 10; i++) {
         System.out.println("i="+i);
      }
   }
   private static void m2(){
      for (int j = 0; j < 10; j++) {
         System.out.println("j="+j);
      }
   }
}
