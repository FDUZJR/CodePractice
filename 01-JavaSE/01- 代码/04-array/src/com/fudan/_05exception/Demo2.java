package com.fudan._05exception;
/*
数组下标越界异常（ArrayIndexOutOfBoundsException）
   用来描述访问了某个数组的一个不存在（不合法）的下标时出现问题的异常
注意事项
   1.这是一个单独针对数组操作的异常，从名字就可以看出；
   2.该异常在数组操作中很常见，尤其在循环中，当你误判了循环的变量时是很容器出现该异常的。
*/
public class Demo2 {
   public static void main(String[] args) {
      //（1）访问出界出现异常
      int[] arr ={1,2,3};
      System.out.println("arr[0]="+arr[0]);
      System.out.println("arr[1]="+arr[1]);
      System.out.println("arr[2]="+arr[2]);
      //以上对数组元素的访问都没有问题，下面我们去访问一个不存在与该数组中的元素
      System.out.println("arr[3]="+arr[3]);        //异常：ArrayIndexOutOfBoundsException
      /* 异常信息：
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	     at com.fudan._05exception.Demo2.main(Demo2.java:16)
      */
      //（2）遍历数组出现异常
      for (int i = 0; i < 4; i++) {
         System.out.println(arr[i]);               //（1）执行结果
      }
   }
}
/*执行结果：（先打印出所有的数组元素，再打印第4个元素时出现数组下标越界异常）
1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at com.fudan._05exception.Demo2.main(Demo2.java:24)
*/