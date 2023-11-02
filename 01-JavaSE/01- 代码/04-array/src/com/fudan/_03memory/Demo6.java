package com.fudan._03memory;
/*
数组的静态初始化内存分配过程-->赋值顺序
*/
public class Demo6 {
   public static void main(String[] args) {
      //数组静态初始化
      //（1）基本数据类型
      int[] arr = new int[]{1, 2, 3};
      //（2）引用数据类型
      String[] str = new String[]{"张三","李四"};
   }
}
