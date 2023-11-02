package com.fudan._02use;
/*
数组的初始化
   1.静态初始化
      完整语法 数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3......}
      简化写法 数据类型[] 数组名 = {元素1，元素2，元素3......}
   2.动态初始化
      数据类型[] 数组名 = new 数据类型[数组长度]
      系统（jvm）会自动给数组赋值。int类型的数组，默认值是0。如果是引用数据类型，数组元素的默认值是null
      数组长度只能是正整数，理论上最大可以是 int 的最大值
   new
      new是一个关键字，代表在堆上分配空间，并去创建一个对象
*/
public class Demo2 {
   public static void main(String[] args) {
      //注意：数组中应该放相同数据类型的元素
      //（1）静态初始化
      //1）完整语法
      int[] arr1 = new int[]{1, 2, 3};
      //2）简化写法
      int[] arr2 = {3, 4, 5};
      //3）简化写法错误示例
      //数组初始化，必须紧跟在声明后面
      // int[] arr3;
      // arr3 = {1, 2, 3};
      //（2）动态初始化
      //1）可以使用快捷键
      int[] arr4 = new int[4];
      //2）String数组
      //快捷键 .var
      String[] strings1 = new String[3];
      //快捷键 alt+enter
      String[] strings2 = new String[6];
   }
}