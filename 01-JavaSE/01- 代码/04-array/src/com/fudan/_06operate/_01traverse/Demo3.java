package com.fudan._06operate._01traverse;

import java.util.Arrays;

/*
增强for循环（迭代器）
语法：
   for(数据类型，变量名：数组名){
      //业务代码
   }
语法中的各个部分：
   1、数据类型是要遍历数组或集合中元素的数据类型。比如遍历 “int”数组，就应该在数据类型处填 int；
   2、从整个遍历的过程来看，变量名就代表数组/集合中的某一个元素。整体就代表所有元素。
   
增强for循环与普通for循环的区别：
   1、增强for循环的语法更加简洁，并且遍历效率更高；
   2、增强for循环中没有使用数组下标，而是直接遍历元素；
      当你想要在循环中使用数组下标时，就无法使用增强for循环了
   3、增强for循环也叫 “迭代器”（iterator），它仅仅作为一个遍历数组/集合的工具而存在；
   4、在增强for循环中，是不能修改任何值的。
*/
public class Demo3 {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      //增强for循环
      //（1）快捷键（数组名.iter）
      for (int i : arr) {

      }

      //（2）能否使用增强for循环，修改数组/集合元素值?
      // --> 不能
      for (int i : arr) {
         i *= 2;
      }
      System.out.println(Arrays.toString(arr));    //[1, 2, 3, 4, 5]，并没有变为2倍

      //（3）通过下标修改数组元素值
      //只能通过普通for循环，不能使用增强for循环
      for (int i = 0; i < arr.length; i++) {
         arr[i] *= 2;
      }
      System.out.println(Arrays.toString(arr));    //[2, 4, 6, 8, 10]，成功修改
   }
}

