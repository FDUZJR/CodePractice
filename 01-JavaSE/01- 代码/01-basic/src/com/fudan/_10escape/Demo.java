package com.fudan._10escape;
/*
转义字符
*/
public class Demo {
   public static void main(String[] args) {
      System.out.println("aaaabbbc\b");      //aaaabbb
      System.out.println("aaa\nbbb");        //aaa  bbb（aaa与bbb分别处于不同的2行）
      System.out.println("aa\tbb");          //aa  bb
      System.out.println("aa\\bb");          //aa\bb
      System.out.println("aa\'bb");          //aa'bb
      System.out.println("aa\"bb");          //aa"bb
      System.out.println("\041");            // !
   }
}