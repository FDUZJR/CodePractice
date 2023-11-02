package com.fudan._12loop;
/*
练习（while）
珠峰高度为8848m，假设有一张足够大的可折叠智障，初始厚度是0.01m
求这张纸折叠多少次，其厚度就可以超过珠峰
*/
public class Demo3 {
   public static void main(String[] args) {
      //定义计数器（需要折叠多少次）
      int count = 0;
      //定义初始厚度
      double x = 0.01;
      //循环
      while(x <= 8848){
         x *= 2;
         count++;
      }
      System.out.println(count);
   }
}
