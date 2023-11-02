package com.fudan._04const;
/*
常量：在程序运行过程中，不会发生改变的量

分类：
   1.字面值常量
      整数常量：代码中写的整数
      小数常量：代码中写的小数
      字符常量：代码中写的字符，用''引起来的
      字符串常量：代码中写的字符串，用""引起来的
      空常量：null 引用数据类型的一个特殊取值
   2.自定义常量
      使用final关键字修饰的常量。
      自定义常量就是使用final来修饰
      通过将变量声明为final，可以防止其值被修改
*/
public class Demo {
   public static void main(String[] args) {
//（1）字面值常量
      //整数常量
      System.out.println(1);
      int a = 10;
      System.out.println(a);
      //小数常量
      System.out.println(1.2);
      double d =3.14;
      System.out.println(d);
      //字符常量
      System.out.println('a');         //a
      char c = '狗';
      System.out.println(c);           //狗
      //字符串常量
      System.out.println("hello world");
      String s = "哈哈";
      System.out.println(s);          //哈哈

      //空常量
      String t = null;
      System.out.println(t);           //null
//（2）自定义常量
      final int b =100;
      System.out.println(b);

      //Cannot assign a value to final variable 'b'
      //b += 1;
   }
}
