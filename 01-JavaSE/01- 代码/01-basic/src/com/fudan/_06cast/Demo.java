package com.fudan._06cast;
/*
数据类型转换
1、自动类型转换
   “自动”不用程序员处理，编译器自行处理
   小范围-->大范围
2、强制类型转换
   需要程序员在代码中显示处理
   大范围-->小范围
   //做类型强转，需要慎重考虑之后，再强转
   写法：目标数据类型 变量名 = (目标数据类型)被转换变量的变量名

3.注意：
   1）基本数据类型之间的数据类型转换，必须在byte、short、int、long、float、double这些类型与char类型之间进行
   2）boolean类型不参与基本数据类型的数据类型转换

引用数据类型也可以做强转，但是后面讲
*/
public class Demo {
   public static void main(String[] args) {
   //(1)自动类型转换（小范围-->大范围）
      byte b1 = 1;
         //byte --> short
         short b2 = b1;
         //short --> int
         int b3 = b2;
      float f1 = 3.14F;
         //float --> double
         double d1 = f1;
         //int --> double
         double d2 = b3;

   //(2)强制类型转化（大范围-->小范围）
      int a1 =10;
         //int --> byte 编译错误，不允许
         //byte b6 = a1;
         //报错为：Incompatible types. Required:byte  Found:int
      int a2 = 11;
      // int --> byte（大-->小）
         //这种情况就需要手动处理
         byte b6 =(byte) a2;

       //溢出的情况
      int a7 = 128;
      byte a8 =(byte)a7;
      System.out.println(a8);          //-128

      double d7 =3.14;
      //double --> float
      float f7 =(float)d7;

   //(3)快捷键
      // .cast 或 alt+enter（代码智能补全）
      //（1）alt+enter的过程，先写出 float f8 = d7; 再alt+enter选择 Cast to 'float'
      float f8 = (float) d7;
      //（2）.cast的过程，先写出 float f9 = d7.cast，再智能选择。最后需要在()中手动写上float
      float f9 = ((float) d7);
   }
}
