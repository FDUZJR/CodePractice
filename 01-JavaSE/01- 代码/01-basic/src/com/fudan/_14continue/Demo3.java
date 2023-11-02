package com.fudan._14continue;
/*输出7次学习java*/
public class Demo3 {
   public static void main(String[] args) {
      for (int i = 0; i <= 10; i++) {              //有11次
         if (i % 3 == 0) {                         //该条件有4次（0、3、6、9）
            continue;                              //跳过这4次（-4）
            //System.out.println("学习java");
         }
         System.out.println("学习java");            //输出7次
      }
   }
}