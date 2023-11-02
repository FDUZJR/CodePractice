package com.fudan._06operate._01traverse;

import java.util.Arrays;

/*
（1）数组遍历并输出值，是非常常见的操作
    如果仅仅是想看一下数组里面的元素都有哪些，完全不需要自己手动写代码实现。而是使用下面的方法：
    Arrays.toString(数组)
（2）Arrays是java.util包下的一个类，是一个工具类
    参数：需要传递一个数组
    返回值：是一个String对象
    作用：遍历数组元素
*/
public class Demo2 {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      String s = Arrays.toString(arr);
      System.out.println(s);              //[1,2,3,4,5]
   }
}
