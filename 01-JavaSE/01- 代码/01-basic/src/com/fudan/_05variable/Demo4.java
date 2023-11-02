package com.fudan._05variable;
/*
浮点数的精度问题：

十进制正小数（0.开头）转换成二进制，先用小数部分乘以2，取出结果的整数部分（必然是1或者0）
   1.然后小数部分继续乘以2
   2.直到小数部分为0，或者已经达到了最大的位数
   3，最终的结果（0.开头）郑旭排列

以0.1为例：
0.1×2=0.2--->0
0.2×2=0.4--->0
0.4×2=0.8--->0
0.8×2=1.6--->1  余数0.6
0.6×2=1.2--->1  余数0.2
0.2×2=0.4--->0
...
无限循环
*/
public class Demo4 {
   public static void main(String[] args) {
      //1.使用Java代码计算 10/3.0
      System.out.println(10/3.0);      //3.3333333333333335
      //2.使用java计算 1-0.9
      System.out.println(1-0.9);       //0.09999999999999998

      double a =0.1;
      float b =0.1F;
      System.out.println(a == b);        //false

      float c =0.1F;
      float d = 0.10000000001F;
      System.out.println( c==d );         //true 有效位数有限
   }
}
