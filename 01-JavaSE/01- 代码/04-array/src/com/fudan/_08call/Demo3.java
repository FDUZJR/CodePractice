package com.fudan._08call;

import java.util.Arrays;

public class Demo3 {
   public static void main(String[] args) {
      //定义引用数据类型
      int[] arr = {1,2,3};
      System.out.println("调用test方法之前，main方法中的数组为："+ Arrays.toString(arr));
      test(arr);
      System.out.println("调用test方法之后，main方法中的数组为："+ Arrays.toString(arr));
   }

   private static void test(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         arr[i] *=2;
      }
      System.out.println("test方法中的数组为："+Arrays.toString(arr));
   }
}
/*
      调用test方法之前，main方法中的数组为：[1, 2, 3]
      test方法中的数组为：[2, 4, 6]
      调用test方法之后，main方法中的数组为：[2, 4, 6]
*/
