package com.fudan._09scanner;
import java.util.Scanner;
/*
   nextDouble()，可以接收小数
*/
public class Demo2 {
   public static void main(String[] args) {
      //（1）创建Scanner对象
      //快捷键（1）.var （2）alt+enter
      Scanner scanner = new Scanner(System.in);
      //（2）提示
      System.out.println("请输入一个数");
      //（3）调用Scanner中的方法
      //使用这个nextDouble()，可以接收小数
      double num = scanner.nextDouble();
      System.out.println("num="+num);
   }
}
