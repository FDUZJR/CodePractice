package com.fudan._03detail;

/*
调用一参、两参的方法
调用返回值为引用类型的方法
 */
public class Demo4 {
   public static void main(String[] args) {
      //调用一参的方法
      printStr("abc");

      String s ="你好";
      printStr(s);
      //调用两参的方法
      printStr2("流浪地球","没有星际穿越好看");
      //调用返回值是引用类型的方法
      System.out.println(printStr3());
   }

   private static String printStr3() {
      return "不要温和地走进那个良夜";
   }

   private static void printStr2(String str1,String str2) {
      System.out.println(str1+str2);
   }

   private static void printStr(String str) {
      System.out.println(str);
   }
}
