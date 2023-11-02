package com.fudan._07vp;

/*
注意事项：
   1、调用方法时，如果有一个固定参数的方法匹配的同时，也可以与可变长参数的方法匹配，则选择固定参数的方法
   2、调用方法时，如果出现2个可变参数的方法都能匹配，则报错，这2个方法都无法调用了。
注：
   一般来说要避免可变参数的方法。它有发生方法重载的可能性，避免导致方法调用失效情况出现、
   3、可变长参数写到参数列表最后
*/
public class Demo2 {
   public static void main(String[] args) {
      test(1);
      test1();
   }

   private static void test(int a) {
   }

   private static void test1() {
   }

   private static void test2(int a, int... args) {
   }

   private static void test2(int... var) {
   }

   private static void test2(double d, int... var) {
   }

   //可变长参数必须在列表最后，不能放在参数列表的前面写
   //Vararg parameter must be the last in the list
   //public static void test4(int...args,double d){

   //}
}
