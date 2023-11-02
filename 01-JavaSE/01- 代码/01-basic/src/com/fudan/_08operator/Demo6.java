package com.fudan._08operator;

/*
三目运算符
语法：
（条件表达式）?表达式一：表达式二;
   如果为true，执行表达式1
   如果为false，执行表达式2
*/
public class Demo6 {
   public static void main(String[] args) {
      //求2个数的最大值
      int a = 9;
      int b = 11;
      int c = 12;

      //if else的方法
      if (a > b) {
         System.out.println("a大");
      } else {
         System.out.println("b大");           //b大
      }

      //三元运算符
      // a > b ? a : b;    //只写一个三元运算符表达式，并不是一个语句statement，就会报错。比如写成一个语句：
      int maxValue = a > b ? a : b;
      System.out.println(maxValue);          //11


      //一次性求出3个数的最大值
      int maxProValue = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;    //12
      System.out.println(maxProValue);

   }
}
