package com.fudan._05overload;

/*
一个类中有多个方法，可以具有相同的方法名，但是它们的形参列表必须不同。
(1)形参列表不同意味着：
   1.形参数量不同；
   2.形参数量相同时，形参的数据类型不同
   3.形参数量和形参数据类型相同时，形参的数据类型顺序不同
   （和形参名无关）
(2)除开上述条件外，其余的任何不同都无法构成方法重载，经典错误有：
   1.形参的名字不同，可以构成方法重载
   2.返回值不同，可以构成方法重载
   3.修饰符列表不同，可以构成方法重载
*/
public class Demo2 {
   public static void main(String[] args) {

   }

   // 1.计算2个int类型数据之和，并输出结果
   public static void getSum(int a, int b) {
      System.out.println(a + b);
   }

   // 2.计算2个double类型数据之和，并输出结果
   public static void getSum(double a, double b) {
      System.out.println(a + b);
   }

   // 3.计算2个long类型数据之和，并输出结果
   public static void getSum(long a, long b) {
      System.out.println(a + b);
   }
}
//改进为：方法名变为相同。只有其形参列表中的数据类型不同 --> 构成方法重载