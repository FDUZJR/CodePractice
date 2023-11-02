package com.fudan._03memory;
/*
数组的动态初始化，内存的分配过程-->引用数据类型?

数组的基本操作：
   （1）直接打印：获得该数组对象在内存中的地址；
   （2）获取数组长度
         数组名.length
   （3）访问数组元素
         通过下标（index）   数组名[index]
   （4）修改数组元素
         通过下标（index）  数组名[index]=newValue
*/
public class Demo3 {
   public static void main(String[] args) {
      int[] arr = new int[3];
      /* 解释：
         = 赋值符号，将右边的值赋给左边
         new int[3]
         new 在堆上开辟空间，创建对象

         =左边是一个局部变量，名字是arr ，数据类型是int数组类型
         这里赋值的含义是：将堆上创建的数组对象的地址，赋给左边的int数组类型的 arr

         左边的称之为引用，右边的称之为对象（左边是引用，右边是对象）

         引用数据类型分为2个部分：引用+对象
         引用里存的是对象的地址值

         注意：
            1）没有办法直接访问对象，只能通过引用去间接访问对象
            2）引用数据类型的本质：就是对象
         引用与对象的关系：
            举例：电视与遥控器的关系
                 遥控器就是引用，电视就是对象
      */

      //（1）直接打印基本数据类型与引用数据类型
      int a = 1;
      System.out.println(a);        //打印基本数据类型

      int[] arr1 = new int[6];
      System.out.println(arr1);     //打印引用数据类型     [I@677327b6
      /* 引用数据类型打印结果的分析（[I@677327b6）：
         [ -->一维数组
         I --> 表示这是一个整数类型的数字（只能存储整数）
         @ --> @ 符号后面的部分表示对象的哈希码，通常以十六进制表示
         677327b6 --> 16进制数，代表地址值(就是数组的哈希码)
      */

      //（2）获取数组长度
      // 数组名.length
      int length1 = arr.length;
      int length2 = arr1.length;
      System.out.println(length1);              //3
      System.out.println(length2);              //6

      //（3）访问数组元素
      //通过下标（index）   数组名[index]
      System.out.println("arr[0]="+arr[0]);     //arr[0]=0

      //（4）修改数组元素
      // 通过下标（index）  数组名[index]=newValue
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;

      //（5）长度为0的数组
      int[] arr2 = new int[0];
      System.out.println(arr2.length);       //0
   }
}
