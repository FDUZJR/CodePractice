package com.fudan._08operator;
/*
逻辑运算符
   &&（与运算符，其连接的2个条件都为真，结果才为真）   !
*/
public class Demo4 {
   public static void main(String[] args) {
      int age = 20;
      if(age >18 && age <25){
         System.out.println("学生");
      }
   }
}
