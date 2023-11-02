package com.fudan._02basic;

/*
案例2：
   使用递归计算 N（N>=1）的阶乘
   n! = 1*2*3*...*n

   n! =n*(n-1)!
   (n-1)! = (n-1)(n-2)!
   (n-2)! = (n-2)(n-3)!
   ...
   2! = 2 * 1
   1! = 1
*/
public class Demo2 {
   public static void main(String[] args) {
      //假设计算9的阶乘
      System.out.println(getFactorial(9));      //362880
   }

   private static int getFactorial(int n) {
      //递归出口
      if (n == 1) {
         return 1;
      }
      // n! =n*(n-1)!
      return n * getFactorial(n - 1);
   }
}
