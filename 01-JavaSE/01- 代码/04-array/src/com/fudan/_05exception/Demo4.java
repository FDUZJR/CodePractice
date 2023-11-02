package com.fudan._05exception;
/*
数组长度为0和数组是null以及数组未初始化，有什么区别?
（1）数组未初始化：该数组完全不可用，没有初始化的数组毫无意义，一旦使用会编译报错；
（2）数组长度为0和数组未null，都是可以使用的。可以认为是经过初始化的，但是它们都不是正常数组；
   1）长度为0的数组，只在内存中存在结构但是没有存储单元，不能存储任何数据。其操作有：
      1、直接打印数组名可以获得数组对象的地址；
      2、不能访问任何数组的下标，否则都是抛出数组下标越界异常；
      3、输出数组的长度为0
   2）数组为 null。表示数组的引用指向了null，数组（对象）无法进行任何操作。
      1、直接打印数组名得到一个null的字符串；
      2、不能访问任何数组下标，也不能打印数组长度，都会报空指针异常。
*/
public class Demo4 {
   public static void main(String[] args) {
      //（1）数组未初始化：该数组完全不可用，没有初始化的数组毫无意义，一旦使用会编译报错；
      //只声明没有初始化
      int[] arr1;
      //System.out.println(arr1);     //编译错误：Variable 'arr1' might not have been initialized

      //（2）长度为0的数组，可以认为是初始化的
      int[] arr2 = {};
      //可以获取其数组长度
      System.out.println(arr2.length);
      //不能通过下标访问元素
      //System.out.println("arr2[0]=" + arr2[0]);     //ArrayIndexOutOfBoundsException

      //（3）为null的数组，也可以认为是初始化的
      int[] arr3 = null;
      //可以直接打印
      System.out.println(arr3);
      //不能获取长度
      //System.out.println(arr3.length);           //NullPointerException
      //不能通过下标访问元素
      System.out.println(arr3[0]);                 //NullPointerException
   }
}
