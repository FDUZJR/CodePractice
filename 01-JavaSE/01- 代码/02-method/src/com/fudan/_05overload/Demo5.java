package com.fudan._05overload;
/*
使用方法重载，控制台输出各种数据类型
*/
public class Demo5 {
   public static void main(String[] args) {

   }
   public static void printElement(byte num){
      System.out.println(num);
   }
   public static void printElement(short num){
      System.out.println(num);
   }
   public static void printElement(int num){
      System.out.println(num);
   }
   public static void printElement(long num){
      System.out.println(num);
   }
   public static void printElement(double num){
      System.out.println(num);
   }
   public static void printElement(float num){
      System.out.println(num);
   }
   public static void printElement(char c){
      System.out.println(c);
   }
   public static void printElement(String s){
      System.out.println(s);
   }
}
