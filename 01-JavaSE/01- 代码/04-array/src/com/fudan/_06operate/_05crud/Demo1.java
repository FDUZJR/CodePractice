package com.fudan._06operate._05crud;

import java.util.Arrays;
import java.util.Scanner;

/*
数组模拟增删改查
   需求：创建容量为10的String数组，使用String数组保存人名，要求名字不重复
        -->模拟对人名的相关操作
*/
public class Demo1 {
   public static void main(String[] args) {
      //定义String数组
      String[] names = new String[10];
      //增加几个人名
      names[0] = "云海";
      names[1] = "宁清";
      names[2] = "风仔";
      names[3] = "东方";

      //打印人名
      System.out.println(Arrays.toString(names));  //[云海, 宁清, 风仔, 东方, null, null, null, null, null, null]
      printNames(names);
      //打印没有null的人名
      printNamesNoNull(names);

      //测试增（插入）
      //键盘输入名字添加
      nameScanner(names);
      printNames(names);

      //测试删（删除）
      System.out.println(deleteName(names,"东方"));           //true
      printNames(names);         //[云海, 宁清, 风仔, null, null, null, null, null, null, null]

      //测试改（更新）
      System.out.println(updateName(names,"云海","禅师"));   //true
      printNames(names);         //[禅师, 宁清, 风仔, 东方, null, null, null, null, null, null]

      //测试查
      System.out.println(findName(names, "风仔"));    //2（风仔在数组中下标是2，就是第3个人）
      System.out.println(findName(names, "着迷"));    //-1（数组中没有着迷这个人）
      //测试查和改结合
      System.out.println(updateName2(names, "宁清", "骄傲"));     //true
      printNames(names);               //[云海, 骄傲, 风仔, 东方, null, null, null, null, null, null]

   }

   //（1）打印人名的方法
   private static void printNames(String[] names) {
      System.out.println(Arrays.toString(names));
   }

   //（2）过滤掉null的方法
   private static void printNamesNoNull(String[] names) {
      System.out.print("[");
      for (String name : names) {
         if (name == null) {
            continue;
         }
         System.out.print(name);
         System.out.print(",");
      }
      System.out.println("\b]");
   }

   /*（3）增（插入操作）
      分析：在数组中找到了一个null的位置,将要新名字替换一下
      结果:
         1.找到null，用要插入的名字替换null。插入成功；
         2.数组满了，插入失败；
         3.重名，插入失败
      返回值为 int
         如果成功，返回0
         重名了，返回1
         数组满了，返回2
      参数：
         原来数组String[]，新的名字String
   */
   private static int addName(String[] names, String newName) {
      for (String name : names) {
         if (newName.equals(name)) {
            return 1;
         }
      }
      //若是走到这里，说明没有重名的
      for (int i = 0; i < names.length; i++) {
         if (names[i] == null) {
            names[i] = newName;
            return 0;
         }
      }
      //若是执行到这里，说明数组满了，返回2
      return 2;
   }

   //键盘输入名字，添加
   private static void nameScanner(String[] names) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入要添加的名字");
      String s = scanner.nextLine();
      switch (addName(names, s)) {
         case 0:
            System.out.println("成功插入新名字");
            break;
         case 1:
            System.out.println("输入名字重复，不合法");
            break;
         case 2:
            System.out.println("数组已经满了");
      }
   }

   /*（4）删
      分析：
         参数：要操作的数组String[] names,要删除的人名String name
         返回值：boolean
               true：成功 --> 将原来名字的位置替换为null
               false:失败
    */
   private static boolean deleteName(String[] names, String name) {
      for (int i = 0; i < names.length; i++) {
         //逐个比较，找到我们要删除的name
         if (name.equals(names[i])) {
            names[i] = null;
            return true;
         }
      }
      return false;
   }

   /*（5）改（更新）
      参数：数组String[] names,要被修改的名字String oldName，新的名字String newName
      返回值：boolean
         true:改成功
         false：改失败
   */
   private static boolean updateName(String[] names, String oldName, String newName) {
      for (int i = 0; i < names.length; i++) {
         if (oldName.equals(names[i])) {
            names[i] = newName;
            return true;
         }
      }
      return false;
   }

   /*（6）查找
      思路：根据要找的名字在数组中匹配
      参数：提供的数组String[] names，要查找的名字String name
      返回值：int类型
         返回数组的下标（查找到的元素在数组中是第几个）
         成功：index
         失败：返回-1，数组的下标不会是-1
   */
   private static int findName(String[] names, String name) {
      for (int i = 0; i < names.length; i++) {
         //找名字
         if (name.equals(names[i])) {
            return i;
         }
      }
      //程序执行到这里，表示没找到
      return -1;
   }

   /*（7）查和改结合
         好好体会这个逻辑
    */
   public static boolean updateName2(String[] names, String oldName, String newName) {
      //调用上面的查找方法：
      int index = findName(names, oldName);
      //接收方法的返回值int index
      if (index == -1) {
         return false;
      }
      names[index] = newName;
      return true;
   }
}

