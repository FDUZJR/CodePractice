package com.fudan._03datatype;
/*
数据类型可以看成是变量的分类，我们可以从2个角度来理解数据类型

从内存角度 --- 数据最终是要存储在内存中的
-数据类型可以看成是对内存空间的一个抽象表达方式，一种数据类型对应一种内存空间。
-该种数据类型的内容空间只能存储该种数据类型的变量，而不能存储别的数据类型的变量。

从数据的使用角度 --- 数据被存储后，是需要被舒勇·的
-数据类型，表示的是一组数据的结婚，是基于该数据类型集合的一组合法操作。
-也就是说，数据类型不仅表示一组数据的集合，更重要的是他还限制了这组数据能够执行的操作

总之，数据类型的意义在于：
-告诉Java编译器，定义了何种数据类型的变量。
-因为只有明确了数据类型，JVM才知道需要多大内容的空间去存该数据

数据类型分类
1.基本数据类型（8种4类）
   整形： byte     1B
         short    2B
         Int      4B
         long     8B
   浮点型：
         float（单精度）  4B
         double（双精度） 8B
   字符型
         char     2B
   布尔型
         boolean 取值 true/false
2.引用数据类型
   除了8种4类的基本数据类中之外的其他类型，都是引用数据类型
   目前还没有学其他的，String阶段使用的频率很多

3.介绍String
   String 类代表字符串。
   Java程序中所有字符串字面值（如"abc"），都作为该类的实例实现。
*/
public class Demo {
   public static void main(String[] args){
      //整形
      byte a1=1;
      short a2 =1;
      int a3 =1;
      long a4 =1L;      //


      char c = 'a';
      System.out.println(c);        //输出的是字符a
      System.out.println(c+1);      //输出的是（字符a的码值+1）（97+1）

      char c1 = '你';                //char类型的变量，用单引号
      System.out.println(c1);        //你

      //String引用类型
      String str1 ="abc";
      String str2 ="xyz";
      //equals方法，比较的是2个字符串的内容，返回true或false
      System.out.print(str1.equals(str2));      //false
   }
}
