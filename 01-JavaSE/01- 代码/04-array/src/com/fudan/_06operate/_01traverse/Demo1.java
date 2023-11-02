package com.fudan._06operate._01traverse;

/*
数组的遍历
*/
public class Demo1 {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      //遍历数组
      //快捷键（数组名.fori）
      traverse1(arr);      // 给每一个方法，都传入数组arr
      traverse2(arr);
      traverse3(arr);
      traverse4(arr);
      traverse5(arr);
      traverse6(arr);
      traverse7(arr);
      traverse8(arr);
      traverse9(arr);
   }

   private static void traverse1(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
   }

   /* 遍历结果
         1
         2
         3
         4
         5
   */
   //优化方案1
   //让输出的结果更好看一些，比如:[1,2,3,4,5]
   private static void traverse2(int[] arr) {            //[1,2,3,4,5,]
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      System.out.println("]");
   }
   //优化方法2
   //traverse2输出结果为：[1,2,3,4,5,]。多了一个,号，继续优化：
   private static void traverse3(int[] arr) {            //[1,2,3,4,5]
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         if (i != arr.length - 1) {
            System.out.print(",");
         }
      }
      System.out.println("]");
   }

   //优化方法3
   private static void traverse4(int[] arr) {            //[1,2,3,4,5]
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         if (i == arr.length - 1) {
            break;
         }
         System.out.print(",");
      }
      System.out.println("]");
   }

   //优化方法4
   //先输出前n-1个元素，再输出最后一个
   private static void traverse5(int[] arr) {            //[1,2,3,4,5]
      System.out.print("[");
      for (int i = 0; i < arr.length - 1; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      //输出最后一个元素
      System.out.print(arr[arr.length - 1]);
      System.out.println("]");
   }

   //优化方法5
   //可以使用转义字符\b
   private static void traverse6(int[] arr) {            //[1,2,3,4,5]
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      System.out.println("\b]");
   }

   //优化方法6
   //方法能够接收特殊数组（null数组/长度为0的数组）的输入而能够正常输出
   //能够接收长度为0的数组
   public static void traverse7(int[] arr) {             //[1,2,3,4,5]
      //先判断null
      if (arr == null) {
         System.out.println("数组长度为null");
         return;              //表示直接结束该方法，不用再执行后面的程序
      }
      //判断数组长度
      if (arr.length == 0) {
         System.out.println("数组长度为0，不合法");
         return;
      }
      //业务
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      System.out.println("\b]");
   }

   //优化方法7
   //要求能够接收 空数组
   private static void traverse8(int[] arr) {            //[1,2,3,4,5]
      //判断数组长度
      if (arr.length == 0) {
         System.out.println("数组长度为0.不合法");
         return;
      }
      //业务
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      System.out.println("\b]");
   }

   //优化方法8
   //null数组和长度为0的数组一起判断
   private static void traverse9(int[] arr) {            //[1,2,3,4,5]
      if (arr.length == 0 && arr == null) {
         System.out.println("数组不合法");
         return;
      }
      //业务
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
         System.out.print(",");
      }
      System.out.println("\b]");
   }
}

