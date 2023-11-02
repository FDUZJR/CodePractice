package com.fudan._01introduction;

/*
特别的，在一个方法中再次调用该方法，就像故事中剃刀同样的故事一样
我们将方法在运行时调用自身的情况，称之为“递归”，又叫做递归调用
*/
public class Demo1 {
   public static void main(String[] args) {
      //调用 method 方法
      method();
   }

   private static void method() {
      //java.lang.StackOverflowError
      //栈溢出错误
      method();
   }
}
