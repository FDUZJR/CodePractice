package com.fudan._05overload;

/*
   不同的参数，找不同的方法
*/
public class Demo3 {
   public static void main(String[] args) {
      test(10);            //优先找方法1
      test(1.1F);          //优先找方法2
      test(3.14);          //优先找方法3
   }

   //方法1
   public static void test(int a) {

   }

   //方法2
   public static void test(float a) {

   }

   //方法3
   public static void test(double a) {

   }
}
