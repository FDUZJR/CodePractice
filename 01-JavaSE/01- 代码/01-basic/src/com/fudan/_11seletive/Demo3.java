package com.fudan._11seletive;

import java.util.Scanner;

public class Demo3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入一个数字月份");
      int i = scanner.nextInt();
      switch (i) {
         case 10:
         case 9:
         case 8:
            System.out.println("秋天");
            break;
         case 7:
         case 6:
         case 5:
            System.out.println("夏天");
            break;
         case 4:
         case 3:
         case 2:
            System.out.println("春天");
            break;
         case 1:
         case 12:
         case 11:
            System.out.println("冬天");
            break;
         default:
            System.out.println("输入无效");
            break;
      }
   }
}
