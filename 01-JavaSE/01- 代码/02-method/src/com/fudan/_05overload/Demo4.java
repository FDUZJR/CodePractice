package com.fudan._05overload;

/*
调用方法，要按照形参列表传值
*/
public class Demo4 {
   public static void main(String[] args) {
      test(10, 3.14);          //找方法1
      test(3.14, 10);          //找方法2

      //test(10,10)                 //编译不通过（找不到对应的方法）
      //test(3.14,3.14)             //编译不通过（找不到对应的方法）
   }

   //方法1
   private static void test(int a, double b) {

   }
   //方法2
   private static void test(double a, int b) {

   }
}
