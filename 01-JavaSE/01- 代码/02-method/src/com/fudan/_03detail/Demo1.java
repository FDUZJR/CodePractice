package com.fudan._03detail;

/*
（1）返回值与返回类型
   方法可以没有返回值吗？-->可以
   方法介意没有返回值类型吗？-->不可以
      --使用void表示没有返回值的方法（比如main方法）
（2）间接调用
	在main方法中直接调用的有method1、method2、method3
	在main方法中间接调用的有method4、method5
*/
public class Demo1 {
   public static void main(String[] args) {
      // 其他方法，都是在main方法中直接调用的
      method1();
      method2();
      method3();        //调用method3，就会间接调用method4和method5
   }

   private static void method5() {
      System.out.println("method5被执行了");
   }

   private static void method4() {
      System.out.println("method4被执行了");
      method5();              //在method4中调用method5
   }

   private static void method3() {
      System.out.println("method3被执行了");
      method4();              //在method3中调用method4
   }

   private static void method2() {
      System.out.println("Demo1.method1");
      //若是有了void的方法，还使用return，就是结束方法
      return;                 //结束方法
   }

   private static void method1() {
      int a = 1;
      int b = 2;
      System.out.println(a + b);
   }
}
