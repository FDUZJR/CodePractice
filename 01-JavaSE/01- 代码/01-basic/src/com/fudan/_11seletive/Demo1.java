package com.fudan._11seletive;

import java.util.Scanner;

/*
if语句：
   单分支
      if(condition){
      }
   双分支
      if(condition){
      }
   多分支结构
      if(condition){
      }else if(condition){
      }
      ......
      else{
      }

注意事项：
1、多分支的if语句，要么执行一个分支condition，要么就执行else，不可能执行多个分支。
2、condition之间的关系：
   1.如果多个条件之间是互斥关系，那么谁在前谁在后，没什么影响
   2.如果多个条件之间是包含关系，被包含的条件如果被放在了下面，就永远不能生效了
3.else后面不能再加分支了，必须放在最后面
*/
public class Demo1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int i1 = scanner.nextInt();
      int i2 = scanner.nextInt();

      //（1）如果多个条件之间是互斥关系，那么谁在前谁在后，没什么影响
      if (i1 > 0) {
         System.out.println("大于0的数");
      } else if (i1 < 0)
         System.out.println("小于0的数");
      else {
         System.out.println("等于0的数");
      }
      //（2）如果多个条件之间是包含关系，被包含的条件如果被放在了下面，就永远不能生效了
      if (i2 > 0) {
         System.out.println("大于0的数");
      } else if (i2 > 3) {                        ///这个条件无法生效
         System.out.println("大于3的数");
      }
   }
}
