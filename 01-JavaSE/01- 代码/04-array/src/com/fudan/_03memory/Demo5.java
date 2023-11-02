package com.fudan._03memory;
/*
String的比较
*/
public class Demo5 {
   public static void main(String[] args) {
      //（1）基本数据类型（如 int）的比较，使用 == 运算符比较的是它们的值是否相等
      int a = 1;
      int b = 2;
      System.out.println(a == b);              //false

      //（2）引用类型（如 String），== 运算符比较的是引用（内存地址）是否相等，即它们是否引用了相同的对象。
      String s1 = "abc";
      String s2 = "abc";
      //s1 和 s2 都指向字符串常量池中的同一个字符串对象
      System.out.println(s1 == s2);            //true

      //（3）通过 new 关键字创建了一个新的字符串对象
      String s3 = new String("abc");
      System.out.println(s1 == s3);            //false
      System.out.println(s2 == s3);            //false
   }
}
