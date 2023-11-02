package com.fudan._04example;

/*
定义一个计算器，功能为：
1.可以计算加减乘除
2.可以计算 平方数
3.求 a 的 n 次方
4...
*/
public class Calculator {
   public static void main(String[] args) {
      //加减乘除
      System.out.println(add(1, 2));             //3.0
      System.out.println(sub(2, 3));             //-1.0
      System.out.println(mul(3, 4));             //12.0
      System.out.println(divide(4, 5));          //0.8
      //平方
      System.out.println(squre(6));                 //36.0
      //a的n次方
      System.out.println(pow(7, 8));             //5764801.0
   }

   private static double pow(double a, double b) {
      return Math.pow(a, b);
   }

   private static double squre(double a) {
      return a * a;
   }

   private static double divide(double a, double b) {
      return a / b;
   }

   private static double mul(double a, double b) {
      return a * b;
   }

   private static double sub(double a, double b) {
      return a - b;
   }

   private static double add(double a, double b) {
      return a + b;
   }
}
