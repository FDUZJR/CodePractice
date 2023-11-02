package com.fudan._09scanner;

import java.util.Scanner;
/*
混合输入
    如何解决混合输入的问题?
      1.创建2个Scanner对象，分别调用不同的方法
      2.再使用nextLine()方法统一接收
*/
public class Demo4 {
   public static void main(String[] args) {
      //（1）创建Scanner对象
      //快捷键（1）.var （2）alt+enter
      Scanner scanner = new Scanner(System.in);
      //（2）第一次提示、接收并打印
      System.out.println("请输入一个整数");
      String s1 = scanner.nextLine();     //接收控制台输入的字符串
      int i = Integer.parseInt(s1);       //将该字符串转换为一个int类型的整数
      System.out.println("i="+i);        //将该整数输出在控制台上
      //（4）第二次提示、接收并打印
      System.out.println("请输入一个单词");
      String s2 = scanner.nextLine();
      System.out.println("s2="+s2);
   }
}
