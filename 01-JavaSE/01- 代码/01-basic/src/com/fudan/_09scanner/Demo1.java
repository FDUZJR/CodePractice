package com.fudan._09scanner;
import java.util.Scanner;
/*
nextInt()方法，可以接收整数
*/
public class Demo1 {
   public static void main(String[] args) {
      //（1）创建Scanner对象
      //快捷键（1）.var （2）alt+enter
      Scanner scanner = new Scanner(System.in);
      //（2）提示
      System.out.println("请输入一个数");
      //（3）调用Scanner中的方法
      //调用nextInt()方法，可以接收整数
      //使用这个nextlnt()方法的时候，只输入整数，别的不要输入
      int num = scanner.nextInt();
      System.out.println("num="+num);
   }
}
