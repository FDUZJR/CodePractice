package com.fudan._07expression;
/*
练习
*/
public class Demo3 {
   public static void main(String[] args) {

      byte b1 = 1, b2 = 2 ,b;
      //byte+byte=int，再强转为byte
      b= (byte) (b1+b2);
      //byte+byte=int，再强转为char
      char c = (char) (b1+b2);

      //11个1
      //long d1 = 11111111111;      //报错
      long d2 = 11111111111L;
   }
}
