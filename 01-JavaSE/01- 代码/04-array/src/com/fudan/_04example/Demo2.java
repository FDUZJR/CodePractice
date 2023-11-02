package com.fudan._04example;

/*
定义2个数组：
（1）静态初始化一个数组，输出数组名，元素取值，长度
（2）声明第2个数组，将第1个数组的地址赋值给第二个数组
（3）输出第二个数组的数组名，元素取值，长度
（4）给第2个数组赋值，再次输出2个数组的名字及元素
*/
public class Demo2 {
   public static void main(String[] args) {
      //静态初始化第1个数组
      int[] arr1 = {1, 2, 3};
      //声明第2个数组,将第1个数组的地址赋值给第二个数组
      int[] arr2;
      arr2 = arr1;
      //输出第1个数组的数组名、元素值、长度
      System.out.println("arr=" + arr1);           //arr=[I@677327b6
      System.out.println(arr1[0]);                 //1
      System.out.println(arr1[1]);                 //2
      System.out.println(arr1[2]);                 //3
      System.out.println(arr1.length);             //3
      //输出第2个数组的数组名、元素值、长度
      System.out.println("arr=" + arr2);           //arr=[I@677327b6
      System.out.println(arr2[0]);                 //1c
      System.out.println(arr2[1]);                 //2
      System.out.println(arr2[2]);                 //3
      System.out.println(arr2.length);             //3

      //给第2个数组赋值，再次输出2个数组的名字及元素
      arr2[0] = 11;
      arr2[1] = 22;
      arr2[2] = 33;
      //输出第1个数组的数组名、元素值、长度
      System.out.println("arr=" + arr1);           //arr=[I@677327b6
      System.out.println(arr1[0]);                 //11
      System.out.println(arr1[1]);                 //22
      System.out.println(arr1[2]);                 //33
      System.out.println(arr1.length);             //3
      //输出第2个数组的数组名、元素值、长度
      System.out.println("arr=" + arr2);           //arr=[I@677327b6
      System.out.println(arr2[0]);                 //11
      System.out.println(arr2[1]);                 //22
      System.out.println(arr2[2]);                 //33
      System.out.println(arr2.length);             //3
   }
}
/*
------------------------------ 规律 -------------------------------------
（1）静态初始化数组时，数组名代表数组的引用，但输出数组名会得到一个标识这个数组的内存地址的字符串表示。在这个代码中，输出的数组名都是 arr=[I@677327b6。
（2）当将一个数组赋值给另一个数组时，实际上是将第一个数组的引用赋值给了第二个数组，而不是复制数组的内容。这意味着两个数组引用同一个数组对象。
（3）当改变一个数组的内容时，由于两个数组引用同一个对象，另一个数组的内容也会发生相应的变化。在这个代码中，改变了 arr2 的元素值后，arr1 的元素值也发生了变化。
   ** 在Java中，数组是引用类型，这意味着数组变量存储的是数组对象在内存中的地址，而不是实际的数据内容。
*/