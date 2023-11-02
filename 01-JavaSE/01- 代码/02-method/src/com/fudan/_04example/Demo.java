package com.fudan._04example;

import java.util.Scanner;

/*
1.求两个数的最大值
2.键盘录入两个数，求最大值
3.定义一个方法，用于判断一个正整数的奇偶性，要求：
   1.奇数方法返回false
   2.偶数方法发挥true
4.定义一个方法，求圆的面积：
   1.方法参数：半径（radius）
   2.圆周率3,14（获取用Math.PI获取）
*/
public class Demo {
   public static void main(String[] args) {

      System.out.println(getMaxValue(30, 20));      //20

      getMaxScannerValue();

      System.out.println(judge1(11));                //false
      System.out.println(judge2(2));                 //true

      System.out.println(area(6.2));                    //120.76282160399165
   }

   // 1.求两个数的最大值
   private static int getMaxValue(int a, int b) {
      return a > b ? a : b;
   }

   // 2.键盘录入两个数，求最大值
   private static void getMaxScannerValue() {
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("请输入第一个数");
      int i1 = scanner1.nextInt();
      System.out.println("请输入第二个数");
      int i2 = scanner1.nextInt();
      int maxScannerValue = i1 > i2 ? i1 : i2;
      System.out.println(maxScannerValue);
   }

   /*3.定义一个方法，用于判断一个正整数的奇偶性，要求：
       1.奇数方法返回false
       2.偶数方法发挥true                       */
   //第一种方法：
   private static boolean judge1(double num) {
      if (num % 2 == 0) {
         return true;
      } else {
         return false;
      }
   }
   //第二种写法：
   private static boolean judge2(double num) {
      boolean flag = false;
      if(num%2==0){
         flag = true;
      }else{
         flag =false;
      }
      return flag;
   }

   /*  4.定义一个方法，求圆的面积：
         1.方法参数：半径（radius）
         2.圆周率3,14（获取用Math.PI获取）*/
   private static double area(double r){
      return Math.PI*r*r;
   }
}
