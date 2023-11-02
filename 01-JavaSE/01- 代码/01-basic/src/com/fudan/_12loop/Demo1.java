package com.fudan._12loop;

/*
死循环
（1）第一种
    for( ; ;){
         //循环体
    }
（2）第二种
   while(true){
         //循环体
   }
*/
public class Demo1 {
   public static void main(String[] args) {
      //（1）第一种
 /*     for( ; ;){
         //循环体
         System.out.println("hello world");
      }*/

      //（2）第二种
      while (true) {
         //循环体
         System.out.println("hello world");
      }
   }
}