package com.fudan._08operator;

/*
赋值运算符
   =
   +=

注意：
   隐含强制类型转换
   （1）若是我们写成 a+=1; 的形式，就会将强制类型转换隐含在其中；
   （2）若是写为 a=a+1;，就不会隐含强制类型转换，需要我们自己手动强转。
*/
public class Demo2 {
   public static void main(String[] args) {
      int a = 1;
      a += 1;
      // a+=1 --> a=a+1
      // 隐含强制类型转换
      // 正常情况下 short+1 结果是 int 类型
      short s1 = 1;
      s1 += 1;          //隐含了强制类型转换

      // s1=s1+1;     //Incompatible types. Required:short  Found:int（需要强制类型转换）
      s1 = (short) (s1 + 1);
   }
}