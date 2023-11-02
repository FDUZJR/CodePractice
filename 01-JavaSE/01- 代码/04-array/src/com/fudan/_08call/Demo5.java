package com.fudan._08call;

import java.util.Arrays;

public class Demo5 {
   public static void main(String[] args) {
      int[] arr1 = {1, 1, 1};
      int[] arr2 = {2, 2, 2};
      swap(arr1, arr2);
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
   }

   private static void swap(int[] arr1, int[] arr2) {
      if (arr1.length != arr2.length) {
         throw new IllegalArgumentException("Arrays must have the same length");
      }

      for (int i = 0; i < arr1.length; i++) {
         int temp = arr1[i];
         arr1[i] = arr2[i];
         arr2[i] = temp;
      }
   }
}

