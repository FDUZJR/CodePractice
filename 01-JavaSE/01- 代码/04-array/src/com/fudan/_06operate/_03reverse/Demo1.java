package com.fudan._06operate._03reverse;

import java.util.Arrays;

/*
数组逆序
*/
public class Demo1 {
   public static void main(String[] args) {
      int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      System.out.println(Arrays.toString(reverse1(arr1)));      //[9, 8, 7, 6, 5, 4, 3, 2, 1]
      int[] arr2 = {3, 4, 5, 6, 7, 8};
      System.out.println(Arrays.toString(reverse2(arr2)));      //[8, 7, 6, 5, 4, 3]
   }

   //（1）二分法数组逆序
      /*
      参数：传入一个数组
      返回值：返回一个逆序的数组
      */
   private static int[] reverse1(int[] arr1) {
      /*数组元素前后交换
        0 <---> length-1
        1 <---> length-2
        2 <---> length-3
        ... 交换时，需要有一个变量temp保存临时数据
      */
      for (int i = 0; i < arr1.length / 2; i++) {        //一定要 /2，否则又会换回来
         int temp;
         temp = arr1[i];
         arr1[i] = arr1[arr1.length - 1 - i];
         arr1[arr1.length - 1 - i] = temp;
      }
      return arr1;
   }

   //（2）2个标记求数组逆序
      /*
      参数：传入一个数组
      返回值：返回一个逆序的数组
       */
   private static int[] reverse2(int[] arr2) {
      //定义2个标记：start、end
      //start=0，end=length-1
      //每次循环1次，start++,end--
      for (int start = 0, end = arr2.length - 1; start < end; start++, end--) {
         int temp = arr2[start];
         arr2[start] = arr2[end];
         arr2[end] = temp;
      }
      return arr2;
   }
}
