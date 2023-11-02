package com.fudan._08operator;

/*
算数运算符
   /：整除
   %：模运算 --> 可以做奇偶数判断
   ++

a++和 ++a 的区别：
   ++符号在前还是在后
   ++a：先+1再取值
   a++：先取值再+1
*/
public class Demo1 {

   public static void main(String[] args) {
      int a = 10;
      int b = 3;
      System.out.println(a / b);         //3
      System.out.println(b / a);         //0
      System.out.println(a % b);         //1
      System.out.println(a / (b * 1.0));   //3.3333333333333335

      if (a % b == 0) {
         System.out.println("偶数");
      } else {
         System.out.println("奇数");     //奇数
      }

      int x = 10;
      int y = 10;
      int z = 10;
      x = y++;
      z = --x;
      y = ++x;
      x = z--;
      System.out.println(x);              //9
      System.out.println(y);              //10
      System.out.println(z);              //8

      int p = 4;
      int q = (p++) + (++p) + (p * 10);
      System.out.println(q);              //70
   }
}
