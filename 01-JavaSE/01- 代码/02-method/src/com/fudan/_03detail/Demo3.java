package com.fudan._03detail;

/*
方法的返回值与返回值的数据类型保持一致
*/
public class Demo3 {
   public static void main(String[] args) {

   }

   public static int m1() {       //该方法签名上，规定死了返回值的范围，不能超过
      //（1）一致
      int a = 1;
      //（2）兼容
      //返回值类型是个大范围的，允许返回小范围的数据类型
      byte b = 2;
      //（2）错误
      //返回值类型超出方法签名上的定义
      double d = 3.14;
      //return d;          //Incompatible types. Required:int  Found:double
      //return a;          //√
      return b;            //√（这里return后面，跟 a和 b都正确）
   }

   public static double m2() {
      //return 1;          //√
      //return 1.1;        //√
      return 3.14F;        //√
   }
}
