package com.fudan1;

import org.junit.Test;
import java.util.Scanner;
/*
单元测试方法，和 main方法效果类似

（1）格式：
      public void 方法名(){

      }
（2）@Test是一个注解
（3）创建一个注解实例
   使用步骤：
   1.导包 alt+enter
   2.写方法，遵循格式要求
   3.方法上面加上@Test
（4）如果在测试方法中没办法输入内容，就配置一下 Help-->edit customer VMoptiuons
   -Deditable.java.test.console=true
*/

public class Demo3 {
   @Test
   public void readTest(){
      System.out.println("aaa");
   }

   @Test
   public void  test1(){
      System.out.println("test method");
   }

   @Test
   public void test2(){
      String s ="abc";
      for (int i = 0; i < 100000; i++) {
         s += "a";
      }
   }

   @Test
   private void test3(){
      System.out.println(10/3);
   }

   @Test
   private void test4(){
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      System.out.println(s);
   }
}

