package com.fudan._14continue;
/*没搞明白，还未实现*/
/*
1.控制台输出2次“学习java”
2.控制台输出7次“学习C++”
3.控制台输出13次“学习Python”
*/
public class Demo2 {
   public static void main(String[] args) {
 /*     for (int i = 0; i <= 10; i++) {
         if (i % 3 == 0) {
            System.out.println("学习java");
         }
      }*/

      for (int x = 0; x < 10; x++) {
         if (x % 3 == 0) {
           break;
         }
         System.out.println("学习C++");
      }


      for (int y = 0; y < 10; y++) {
         if (y % 3 == 0) {
            continue;
         }
         System.out.println("学习Python");
      }
   }
}
