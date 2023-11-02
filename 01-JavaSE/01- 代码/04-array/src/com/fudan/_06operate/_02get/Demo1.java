package com.fudan._06operate._02get;

/*
获取最值
   最大值和最小值
*/
public class Demo1 {
   public static void main(String[] args) {
      int[] arr = {3, 1, 6, 99, 43, 67, 25};
      System.out.println(getMaxValue(arr));        //99
      System.out.println(getMinValue(arr));        //1
   }

   /*
   求最大值
   参数：int数组
   返回值：一个int类型的数字
   */
   private static int getMaxValue(int[] arr) {
      //将数组第一个元素提取出来，作为最大值
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];     //交换swap
         }
      }
      return max;
   }

   /*
   求最小值
   参数：int数组
   返回值：一个int类型的数字
   */
   private static int getMinValue(int[] arr) {
      //将数组中第一个元素，暂定为最小值
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      return min;
   }
}
