package com.fudan._03example;

/*
斐波那契数列
   1,1,2,3,5,8,13,21
求第n个位置的值是多少
f(1)=1
f(2)=1
f(3)=1+1=2=f(1)+f(2)
f(4)=1+2=3=f(2)+f(3)
...
f(n)=f(n-2)+f(n-1)
*/
public class Demo1 {
   public static void main(String[] args) {
      //假设计算第9个位置的斐波那契数
      System.out.println(getFeibonaqi(9));      //34
   }

   private static int getFeibonaqi(int n) {
      //有2个递归出口
      if (n == 1) {
         return 1;
      }
      if (n == 2) {
         return 1;
      }
      //递归体（其实就是递推公式）
      // f(n)=f(n-2)+f(n-1)
      return getFeibonaqi(n - 2) + getFeibonaqi(n - 1);
   }
}
