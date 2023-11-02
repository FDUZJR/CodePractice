package com.fudan._09scanner;
import java.util.Scanner;
/*
nextLine()方法，可以接收字符串
*/
public class Demo3 {
   public static void main(String[] args) {
      //（1）创建Scanner对象
      //快捷键（1）.var （2）alt+enter
      Scanner scanner = new Scanner(System.in);
      //（2）提示
      System.out.println("请输入一句话");
      //（3）调用Scanner中的方法
      //调用nextLine()方法，可以接收字符串
      String s = scanner.nextLine();
      System.out.println("s="+s);
   }
}
