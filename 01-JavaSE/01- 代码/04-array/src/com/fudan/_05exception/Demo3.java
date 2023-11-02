package com.fudan._05exception;
/*
空指针异常
*/
public class Demo3 {
   public static void main(String[] args) {
      //（1）制造空指针异常
      //定义空数组
      int[] arr = null;
      //输出空数组长度
      //System.out.println(arr.length);           //NullPointerException

      //（2）对于空指针异常的处理
      //一般都是通过 'if语句' 进行判断和处理
      if (arr != null) {
         System.out.println(arr.length);
      }

      //（3）空指针异常不仅仅针对于数组，而是针对所有引用数据类型
      String str1 = null;
      System.out.println(str1);                 //null
      String str2 = "abc";
      if(str2!=null){
         System.out.println(str2.length());     //3
      }

      //（4）equals方法注意事项
      //s1.equals(s2)，要保证 s1不为null
      String s1 =null;
      String s2="ttttt";
      System.out.println(s1.equals(s2));        //NullPointerException
      System.out.println(s2.equals(s1));        //false
   }
}