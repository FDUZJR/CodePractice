package com.fudan._08operator;

/*
使用细节和注意事项：
1、在比较时，基本上数据类型和基本数据类型作比较，引用数据类型和引用数据类型作比较。
   1）基本数据类型的数值类型的比较，上述运算符都是可用的。但布尔类型仅适用于“==”或者“！=”的比较。
   2）引用数据类型的变量比较只能实用“==”和“! =”，而且不是任意两个引用数据类型变量都能够比较。
      注：这一条随着知识点的学习，会不断加深，大家可以自行测试
2、基本数据类型的数值类型和 char 是可以互相比较的，boolean类型只能自己和自己比较。
   引用数据类型的比较，只能相同类型之间比较，比如String和String比，String和System之间就不能作比较
3、2个浮点数之间的比较，不建议直接使用比较运算符（因为有一些特殊值）。还有诸如引用数据类型的比较等知识点，在面向对象中学习。
*/
public class Demo3 {
   public static void main(String[] args) {
      //直接使用相等运算符 == 比较不同类型的数据
      int a = 1;
      String s = "abc";
      // Operator '==' cannot be applied to 'int', 'java.lang.String'
      //System.out.println(a == s);

      String s2 = "abcd";
      String s3 = "abc";
      System.out.println(s2 == s3);             //false
      System.out.println(s == s3);              //true
      //String比较内容，建议还是使用equals方法
      System.out.println(s3.equals(s));         //true

      char c = 'a';
      System.out.println(c == 97);              //true
   }
}
