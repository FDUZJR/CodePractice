package com.fudan._15return;
/*
return
   1.结束方法
   2.在方法中表示返回值
*/
public class Demo {
   public static void main(String[] args) {
      System.out.println("main before");

      //return;            //main方法的返回值是void，意味着可以不写retuen
   }

   public static int testA(){
      //若是不加return，报错为：Missing return statement
      return 100;          //方法签名的返回类型为int，那么就需要return一个int类型的值
   }
}
