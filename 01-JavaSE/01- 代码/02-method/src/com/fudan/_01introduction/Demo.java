package com.fudan._01introduction;

/*
方法的引入
引例：现在有3个需求
   1.编写程序，计算10+20，并输出结果；
   2.编写程序，计算111+333，并输出结果；
   3.编写程序，计算333+444，并输出结果；
*/
public class Demo {
   public static void main(String[] args) {
      // 1.编写程序，计算10+20，并输出结果；
      int num1 = 10;
      int num2 = 20;
      int sum1 = num1 + num2;
      System.out.println("sum1=" + sum1);
      // 2.编写程序，计算111+333，并输出结果；
      int num3 = 111;
      int num4 = 222;
      int sum2 = num3 + num4;
      System.out.println("sum2=" + sum2);
      // 3.编写程序，计算333+444，并输出结果；
      int num5 = 333;
      int num6 = 444;
      int sum3 = num5 + num6;
      System.out.println("sum3=" + sum3);
   }
}
