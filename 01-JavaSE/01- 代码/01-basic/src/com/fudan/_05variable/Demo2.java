package com.fudan._05variable;
/*
局部变量的使用
1.声明
   java是强类型语言，你要告诉编译器，定义的变量是什么数据类型的变量
2.语法
   数据类型 变量名
3.初始化：使用 “ = 赋值符号 ”，是对变量进行赋值的过程
*/
public class Demo2 {
   public static void main(String[] args) {
      //声明变量
      int a;
      //若是没有给a变量赋值，就直接打印a，会报错（这就是没有初始化）
      //Variable 'a' might not have been initialized
      //System.out.println(a);

      //初始化（就是给变量赋值）
      a = 1;
      System.out.println(a);

      int b = 100;
      System.out.println(b+1);

      //java支持一行定义多个同种类型的变量
      //但是不要这样去写
      byte b1,b2,b3 = 1;
      //System.out.println(b1);
      //报错为：Variable 'b1' might not have been initialized（b1没有被初始化）

      //这是因为：这种初始化方式，相当于只给b3初始化了，实际上b1、b2都没有被赋值。
   }
}
