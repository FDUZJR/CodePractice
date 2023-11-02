package com.fudan._09scanner;

import java.util.Scanner;

/*
模拟登录
*/
public class Demo5 {
   public static void main(String[] args) {
      //定义用户名
      String userName = "admin";
      //定义M密码
      String password = "123456";
      //创建Scanner对象
      Scanner scanner = new Scanner(System.in);
      //输入用户名、接收用户名
      System.out.println("请输入用户名");
      String user = scanner.nextLine();
      //输入命名、接收密码
      System.out.println("请输入密码");
      String passw = scanner.nextLine();
      ///校验数据正确性
      //输出登陆成功或失败
      if (userName.equals(user) && password.equals(passw)) {
         System.out.println("登陆成功");
      } else {
         System.out.println("登录失败");
      }
   }
}
