package com.fudan._11seletive;

import java.util.Scanner;

/*
switch
   记得加上break
*/
public class Demo2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入一个数字月份");
      int i = scanner.nextInt();
      switch (i) {
         case 10:
            System.out.println("秋天");
            break;
         case 9:
            System.out.println("秋天");
            break;
         case 8:
            System.out.println("秋天");
            break;
         case 7:
            System.out.println("夏天");
            break;
         case 6:
            System.out.println("夏天");
            break;
         case 5:
            System.out.println("夏天");
            break;
         case 4:
            System.out.println("春天");
            break;
         case 3:
            System.out.println("春天");
            break;
         case 2:
            System.out.println("春天");
            break;
         default:
            System.out.println("冬天");
      }
   }
}
