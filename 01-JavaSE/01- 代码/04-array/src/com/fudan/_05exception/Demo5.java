package com.fudan._05exception;

/*
长度为0的数组-->经典用途
   假设方法的返回值是一个数组（或其他容器），而又有无返回数据的需求，这时普遍有2种做法：
   （1）返回一个长度为0的数组（或其他容器）
   （2）返回null
需求：
   根据不同的情况，方法可能有一个结果，有可能没有结果
   这时要返回容器，比如数组/集合
*/
public class Demo5 {
   public static void main(String[] args) {
      int[] result = getResult(2);
      System.out.println("result[0]=" + result[0]);     //result[0]=1
      System.out.println("result[1]=" + result[1]);     //result[0]=2
   }

   // 需求：
   // 根据不同的情况，方法可能有一个结果，有可能没有结果
   // 这时要返回容器，比如数组/集合
   private static int[] getResult(int num) {
      /*
         根据num的值做判断：
         若是num>0，返回2个结果 [1,2]
         若是num<0，返回1个结果 [1]
         若是num=0，返回0个结果 []或 null
      */
      //先定义一个数组作为容器
      int[] arr = {};
      if (num > 0) {
         arr = new int[]{1, 2};
         return arr;
      }
      if (num < 0) {
         arr = new int[]{1};
         return arr;
      }
      //若是执行到这里，就说明 num=0
      return arr;
   }
}
