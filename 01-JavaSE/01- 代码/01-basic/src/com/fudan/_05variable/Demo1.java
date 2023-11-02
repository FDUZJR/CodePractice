package com.fudan._05variable;
/*
变量：在程序运行过程中，可能会发生改变的量

局部变量：在局部位置定义的变量

什么是局部位置？
   --- 只要是在类体中的{}里面的，都是局部位置
   1.方法体内
   2.代码块中
   3.类体中的{}不算局部位置

局部变量的作用域
   局部变量只在{}中生效，出了{}就不生效
  注意：在同一个{}中，不能定义同名的变量
*/
public class Demo1 {
   //此处不是局部位置
   int c =1;         //其实这是成员变量

   {     //代码块内，是局部位置
         //这里定义的变量，就是局部变量
      int d = 1;
   }

  public static void main(String[] args) {
      //方法体内，是局部位置
      int a =1;
      {  //方法体内的代码块
         //int a = 2;       //因为在该main方法中已经定义过a变量，∴不能重复定义

         int b = 3;
         System.out.println(b);
      }

      //尝试在main方法的代码块外，输出b变量
      //Cannot resolve symbol'b'
      //System.out.println(b);
   }

}
