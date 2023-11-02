package com.fudan._08operator;
/*
位运算符
   >>
   <<
   ^
*/
public class Demo5 {
   public static void main(String[] args) {
      int a =13;
      int b=5;
      System.out.println(a^b);         //8
      System.out.println(8^13);        //5
      System.out.println(8^b);         //13

      //满足交换律

      //经典问题：怎么计算 2^16 最高效?(2的16次方)
      double result = Math.pow(2, 16);
      System.out.println("result="+result);     //result=65536.0
      System.out.println(1<<16);                //65536
   }
}
