package com.fudan._05variable;
/*
注意事项：
1.java中的整数字面值常量，默认当做 int 里处理
2.使用long类型，结尾+L来区分
3.Java中的小数字面值常量，默认都当做 double 来处理
4，使用float类型时，结尾+F来区分
*/
public class Demo3 {
   public static void main(String[] args) {
      //1.默认当做int来处理
      System.out.println(1);
      byte b1 =1;
      short b2 =1;

      //2.使用long类型时，结尾+L来区分
      long l = 1111L;
      System.out.println(l);

      //4.使用float类型时，结尾+F来区分
      float f =3.14F;
      System.out.println(f);
   }
}
