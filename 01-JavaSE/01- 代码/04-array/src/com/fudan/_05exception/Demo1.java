package com.fudan._05exception;

/*
异常的介绍
   （1）异常是指：程序在运行期间出现了不正常情况，这种不正常情况的信息就会被封装成一个异常对象
   （2）旦程序出现异常，JVM就会终止程序的执行，并在控制台打印出异常信息
   （3）异常往往都是 XXXException
异常信息
   （1）异常类型的全类名（全限定类型）
   （2）出现异常的原因
   （3）出现错误的代码行（全类名、方法、行数）
出现异常时的程序执行过程：
   （1）出现异常之前的代码，是正常执行不受影响的；
   （2）异常代码行后面的代码就不在执行了；
   （3）当程序执行到错误行代码时，JVM就会将异常信息封装为一个异常对象；
       并将异常对象的信息，打印在控制台上
异常的分类
   1.编译时异常
   2.运行时异常
*/
public class Demo1 {
   public static void main(String[] args) {
      System.out.println("main start");
      //人为制造出一个异常
      System.out.println(10 / 0);              //异常
      System.out.println("main end");

      /* 异常信息为：
      main start
      Exception in thread "main" java.lang.ArithmeticException: / by zero
      at com.fudan._05exception.Demo1.main(Demo1.java:24)
      ----------------------------------------------------------
      （1）异常代码行之前的语句确实被执行了：main start
          异常代码行之后的语句没有被执行。
      （2）ArithmeticException-->算数异常
      */

   }
}
