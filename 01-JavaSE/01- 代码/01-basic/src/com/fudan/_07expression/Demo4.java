package com.fudan._07expression;

/*
整数常量的特殊性
   整数常量的值在程序中不发生变化，值是固定的。编译器比较聪明，会自动判断是否在其数据类型的范围内

注意：
   1.只针对整数常量，整形常量没有这个性质，有变量参与运算，遵循表达式提升
   2.小数常量不具有这种特点
*/
public class Demo4 {
   public static void main(String[] args) {
      byte b1 = 1 + 2;
      int a = 1;
      //错误的2种情况（编译就报错）：
      //byte b2 = a+2;     //Incompatible types. Required:byte  Found:int

      //float f = 0.1;     //Incompatible types. Required:float  Found:double
      // 在编译器中定义一个0.1，其默认就是dobule类型的。直接使用一个float去接收就会报错。
      // 正确做法是：在后面 +L 做区分，让编译器明白这是一个 floact类型的数据
      float f = 0.1F;

      //float f2 = 0.1 + 0.2;                //×
      float f2 = (float) (0.1 + 0.2);        //√
   }
}