package com.fudan._02notation;

import java.sql.SQLOutput;

/*
三种注释:
   单行注释
   多行注释
   文档注释

注意：
   注释不参与编译
   位置可以随便写

文档注释：
   注释的测试类
*/
public class Demo {
   //单行注释快捷键 Ctrl+/
   public static void main(String[] a){
      //输出语句注释
      System.out.println("abc");

   }
   //获取学生的最大年龄方法
   public static void getMaxAge(){

      //多行注释快捷键 Ctrl+Shift+/
      //多行注释
      /*System.out.println("1");
      System.out.println("2");
      System.out.println("3");
      System.out.println("4");*/
   }
}

/* 该类用来演示文档注释的作用*/
class 文档注释{
   /*该方法用于求出学生的最小年龄
   *创建日期：2021/1/6
   * @return void
   * @auth zhan
   *
   * 该文档注释，就用来解释下面这个方法的作用
   */
   public static void getMinAge(){

   }
}
