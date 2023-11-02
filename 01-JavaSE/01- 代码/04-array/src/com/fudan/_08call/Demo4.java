package com.fudan._08call;

import java.util.Arrays;

/*
1.声明并初始化2个数组
2.提供一个交换数组的方法
*/
public class Demo4 {
   public static void main(String[] args) {
      // 1.声明并初始化2个数组
      int[] arr1 = {1, 1, 1};
      int[] arr2 = {2, 2, 2};
      // 2.提供一个交换数组的方法
      swap(arr1, arr2);
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
   }

   private static void swap(int[] arr1, int[] arr2) {
      int[] temp = arr1;
      arr1 = arr2;
      arr2 = temp;
   }
}
