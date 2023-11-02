package com.fudan._13break;

/*
break
*/
public class Demo1 {
   public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {
         if (i == 3) {
            System.out.println(i);
            break;
         }
         System.out.println("i=" + i);
      }

      for (int x = 0; x < 5; x++) {
         for (int y = 0; y < x; y++) {
            if (y == 3) {
               System.out.println("y=" + y);
               break;
            }
         }
         System.out.println("x=" + x);
      }
   }
}
