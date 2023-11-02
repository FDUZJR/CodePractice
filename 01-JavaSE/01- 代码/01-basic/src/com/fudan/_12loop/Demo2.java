package com.fudan._12loop;

/*
用for循环，求出1-100之间的偶数和
*/
public class Demo2 {
   public static void main(String[] args) {
      int sum = 0;            //偶数和，从0开始计算
      //快捷键fori
      for (int i = 1; i < 101; i++) {
         if (i % 2 == 0) {
            sum += i;
         }
      }
      System.out.println("0-100的偶数和为"+sum);
   }
}
