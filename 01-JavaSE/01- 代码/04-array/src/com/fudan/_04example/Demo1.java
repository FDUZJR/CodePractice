package com.fudan._04example;

/*
静态初始化一个数组，输出数地址及元素
然后给数组中的元素赋值，再次输出数组名及数组元素
*/
public class Demo1 {
   public static void main(String[] args) {
      //（1）基本数据类型
      //1）静态初始化一个数组，输出数组名及元素
      int[] arr = {1, 2, 3};
      System.out.println("arr=" + arr);        //arr=[I@677327b6
      System.out.println(arr[0]);            //1
      System.out.println(arr[1]);            //2
      System.out.println(arr[2]);            //3
      //2）然后给数组中的元素赋值，再次输出数组名及数组元素
      arr[0] = 4;
      arr[1] = 5;
      arr[2] = 6;
      System.out.println(arr[0]);            //4
      System.out.println(arr[1]);            //5
      System.out.println(arr[2]);            //6

      //（2）引用数据类型
      //1）静态初始化一个数组，输出数组名及元素
      String[] str = {"狗狗", "猫猫", "鱼鱼"};
      System.out.println(str[0]);            //狗狗
      System.out.println(str[1]);            //猫猫
      System.out.println(str[2]);            //鱼鱼
      //2）然后给数组中的元素赋值，再次输出数组名及数组元素
      str[0] = "旺仔";
      str[1] = "风仔";
      str[2] = "蛋仔";
      System.out.println(str[0]);            //旺仔
      System.out.println(str[1]);            //风仔
      System.out.println(str[2]);            //蛋仔
   }
}
