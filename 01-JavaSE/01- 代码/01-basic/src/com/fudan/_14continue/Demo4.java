package com.fudan._14continue;

public class Demo4 {
   public static void main(String[] args) {
      // 控制台输出2次“学习Java”
      int count1 = 0;
      while (true) {
         System.out.println("学习Java");
         count1++;
         if (count1 == 2) {
            break;
         }
      }

      // 控制台输出7次“学习C++”
      int count2 = 0;
      for (int i = 0; i < 10; i++) {
         if (count2 >= 7) {
            break;
         }
         if (i % 2 == 0) {
            continue;
         }
         System.out.println("学习C++");
         count2++;
      }

      // 控制台输出13次“学习Python”
      int count3 = 0;
      while (count3 < 20) {
         if (count3 >= 13) {
            break;
         }
         count3++;
         if (count3 % 2 == 0) {
            continue;
         }
         System.out.println("学习Python");
      }
   }
}
