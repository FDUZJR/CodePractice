package com.fudan._03memory;
/*
对于引用数据类型，== 比较的是地址值
*/
public class Demo2 {
   public static void main(String[] args) {
      String str1 = "abc";             //内存地址@628
      String str2 = "aaa";             //内存地址@629

      System.out.println(str1 == str2);      //false,2个字符串（引用数据类型）地址不相同
   }
}
