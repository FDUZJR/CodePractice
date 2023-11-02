package com.fudan._06operate._06sort;

import java.util.Arrays;

/*
排序
    Arrays.sort(arr);
*/
public class Demo1 {
   public static void main(String[] args) {
      //定义一个乱序的数组
      int[] arr = {3, 9, 1, 8, 2, 7, 4, 6, 5, 0};
      //使用 Arrays工具 进行排序（效果是从小到大）
      System.out.println("排序前：" + Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("排序后：" + Arrays.toString(arr));
   }
}
/*
      排序前：[3, 9, 1, 8, 2, 7, 4, 6, 5, 0]
      排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/