package com.fudan._06operate._04copy;

import sun.security.util.Length;

import java.util.Arrays;

/*
（1）数组拷贝
      数组的长度是不可以改变的
      ∴若是要实现数组元素真正意义上的删除和新增，一般需要使用数据的拷贝。

（2）大致思路是：创建一个新数组，然后拷贝复制==赋值
      1）首先要明确新数组的长度，并初始化这个数组
      2）然后遍历原先的数组，过滤掉（删）或者新增（增）一些元素，给新数组赋值
*/
public class Demo1 {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 3, 5};
      System.out.println(Arrays.toString(addElementToArray1(arr, 7)));      //[1, 2, 3, 3, 5, 7]
      System.out.println(Arrays.toString(addElementToArray2(arr, 999)));    //[1, 2, 3, 3, 5, 999]
      System.out.println(Arrays.toString(deleteElementToArray(arr, 3)));    //[1, 2, 5]
   }

   /*（1）向数组中添加新的元素的方法
   分析：
      参数：原来的数组 int[],添加的新元素int value
      返回值:新的数组 int[]
   */
   private static int[] addElementToArray1(int[] oldArray, int value) {
      //计算一下新数组的长度，再创建新数组（假设我们在旧数组中添加一个元素）
      int[] newArray = new int[oldArray.length + 1];
      //遍历旧数组
      for (int i = 0; i < oldArray.length; i++) {
         newArray[i] = oldArray[i];            //将旧数组的值赋给新数组
      }
      newArray[newArray.length - 1] = value;     //将新增的值插入新数组
      return newArray;
   }

   /*
   （2）使用增强for循环，向数组中添加新元素
   */
   private static int[] addElementToArray2(int[] oldArray, int value) {
      //创建新数组
      int[] newArray = new int[oldArray.length + 1];
      //定义一个下标
      int index = 0;
      //增强for遍历
      for (int i : oldArray) {
         newArray[index] = i;
         index++;
      }
      newArray[index]=value;
      return newArray;
   }

   /*（3）删除数组元素（重复的元素都删除）
   分析：
      参数：旧数组 int[],要被删除的元素int value
      返回值:新的数组 int[]
   */
   private static int[] deleteElementToArray(int[] oldArray, int value) {
      //计算一下需要删除多少个元素（定义一个计数器），用来统计重复元素
      int count = 0;
      for (int i : oldArray) {
         if (i == value) {
            count++;
         }
      }
      //创建新数组
      int index = 0;
      int[] newArray = new int[oldArray.length - count];

      for (int j : oldArray) {
         if (j == value) {
            continue;
         }
         newArray[index] = j;
         index++;
      }
      return newArray;
   }
}
