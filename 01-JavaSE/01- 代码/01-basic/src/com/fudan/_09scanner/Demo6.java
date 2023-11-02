package com.fudan._09scanner;
import java.util.Random;
import java.util.Scanner;
/*
猜数字
   系统随机生成1个随机数（0-100）
   每次输入一个数字，直到输入正确为止
*/
public class Demo6 {
   public static void main(String[] args) {
      //生成随机数
      Random random = new Random();
      //得到随机数 i
      int i = random.nextInt(101);

      //创建Scanner对象
      //循环接收输入的数字
      Scanner scanner = new Scanner(System.in);
      //提示输出数字
      System.out.println("请输入一个随机数");
      while (true) {
         int s = scanner.nextInt();
         //作比较
         if(s>i){
            System.out.println("输入的数字过大");
         }else if(s<i){
            System.out.println("输入的数字过小");
         }else{
            System.out.println("输入正确");
            break;
         }
      }
   }
}
