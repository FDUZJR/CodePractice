package com.fudan._05overload;

/*
引例：有3个需求，需要写3个方法完成：
1.计算2个int类型数据之和，并输出结果
2.计算2个double类型数据之和，并输出结果
3.计算2个long类型数据之和，并输出结果
*/
public class Demo1 {
   public static void main(String[] args) {

   }

   // 1.计算2个int类型数据之和，并输出结果
   private static void getIntSum(int a, int b) {
      System.out.println(a + b);
   }

   // 2.计算2个double类型数据之和，并输出结果
   private static void getDoubleSum(double a, double b) {
      System.out.println(a + b);
   }

   // 3.计算2个long类型数据之和，并输出结果
   private static void getLongSum(long a, long b) {
      System.out.println(a + b);
   }
}
//发现：3个方法的方法名、形参列表不同，其他都相同
