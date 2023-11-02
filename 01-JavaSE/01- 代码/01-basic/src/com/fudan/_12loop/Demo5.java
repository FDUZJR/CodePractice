package com.fudan._12loop;
/*
使用嵌套循环打印
#
##
###
####
#####
*/
public class Demo5 {
   public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {             //外循环控制行
         for (int j = 0; j <= i; j++) {         //内循环控制列
            System.out.print("#");              //注意是 print（不换行）--让内循环在一列中横向输出
         }
         System.out.println();                  //一行打印完后，换行---让外循环不断换行
      }
   }
}
