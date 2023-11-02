package com.fudan._03detail;
/*
main方法解释
   没有传入参数，那么访问 args[0] 和 args[1] 将会导致数组越界异常（ArrayIndexOutOfBoundsException）。
   因为在没有传入参数的情况下，数组 args 是空的，没有任何元素。
*/
public class Demo5 {
   public static void main(String[] args) {     //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
      System.out.println(args[0]);
      System.out.println(args[1]);
   }
}
