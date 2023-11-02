package com.fudan._07vp;
/*
可变参数适用于：
   参数个数不确定，类型确定的情况下，Java会自动将可变参数当做数组处理
语法：
   权限修饰符列表 方法返回值列表 方法名(形参列表，数据类型......变量名){

   }
调用可变参数的方法时，编译器为该可变参数隐含创建一个数组，在方法体内以数组的形式访问可变参数
*/
public class Demo1 {
   public static void main(String[] args) {
      /*
      需求：求不确定个数的数值之和
      */
      int[] arr = {1,2,3,4,5};
      System.out.println(getSum1(arr));      //15
      System.out.println(getSum2(arr));      //15
   }

   //（1）先使用循环的方式来做
   public static int getSum1(int[] nums) {
      int sum = 0;
      for (int num : nums) {
         sum += num;
      }
      return sum;
   }
   //（2）使用可变长参数来做
   public static int getSum2(int...args){
      int sum = 0;
      for (int arg : args) {
         sum+= arg;
      }
      return sum;
   }
}
