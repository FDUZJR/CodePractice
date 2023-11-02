package com.fudan._02basic;

/*
案例1：
   自然数求和
   1+2+3+4+......+n
   f(10)=10+f(9)
   f(9)=9+f(8)
   f(8)=8+f(7)
   ...
   f(2)=2+f(1)
   f(1)=1

   递推公式：f(n)=n+f(n-1)
*/
public class Demo1 {
   public static void main(String[] args) {

      System.out.println(getSum(10));        //55
   }

   private static int getSum(int n) {
      //一定要有递归出口
      if (n == 1) {
         return 1;
      }
      return n + getSum(n - 1);
   }
}
