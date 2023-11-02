package com.fudan._03detail;

/*
参数的自动类型转换
   如果一个方法需要传入一个long类型的数据类型，那我传入一个int类型的值可以吗? 如果传入一个double类型的值呢?
注意：
   方法在调用时，如果填入的实参的数据类型， 可以自动转换为形参的数据类型，
   那么即便数据类型不一致，语法上依然允许该数据类型的变量作为实参，反之强制类型转换不行（传入的实参类型也要相同或兼容）
*/
public class Demo2 {
   public static void main(String[] args) {
      //调用方法
      byte b = 1;
      int a = 1;
      double d = 3.14;

      m1(b);         //√
      m1(a);         //√
      //m1(d);       //报错为 m1(long) in Demo2 cannot be applied to (double)

      m2(b);         //√
      m2(a);         //√
      m2(d);         //√
      m2(1.1F); //√(也可以直接传入一个小数常量，前面传入的这几个都是变量)
   }

   private static void m1(long num) {

   }

   private static void m2(double num) {

   }
}
// 在报错的调用中，在形参列表直接接收的最大范围为 int的方法中，传入了一个 double的数。超出了范围，所以报错。