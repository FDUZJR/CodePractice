package com.fudan._03example;

/*
青蛙跳台阶
   一只青蛙一次可以调一层台阶，也可以跳2层
   求该青蛙跳上n层台阶总共有多少种跳法（先后次序不同算作不同的结果）
分析：
f(1)= 1
f(2)= 1+1 =2
f(3)= 1+2 =3 =f(1)+f(2)
f(4)= 1+3+1 =5=f(2)+f(3)
...
f(n)=f(n-2)+f(n-1)
*/
public class Demo2 {
   public static void main(String[] args) {
      //假设青蛙跳20层台阶，有多少种跳法
      System.out.println(getSteps(20));   //10946
   }

   private static int getSteps(int n) {
      if (n == 1) {
         return 1;
      }
      if (n == 2) {
         return 2;
      }
      //f(n)=f(n-2)+f(n-1)
      return getSteps(n - 2) + getSteps(n - 1);
   }
}
// 个人发现：在递归体中的return后面，调用了几次方法，就设置几个递归出口。
// 比如29行调用了2次getSteps方法，∴在第22-27行，设置了2个最简单的递归出口。