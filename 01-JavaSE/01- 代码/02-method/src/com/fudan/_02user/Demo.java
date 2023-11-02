package com.fudan._02user;

/*
（1）方法的声明
   [修饰符列表] 返回值类型 方法名(形式参数列表){
       //方法体
   }
（2）两个概念
   1）方法头（方法声明）：[修饰符列表] 返回值类型 方法名(形式参数列表)
   2）方法签名（method signature）：方法名(形式参数列表)

（3）逐一解释
   修饰符列表
      可以为空，参照main方法 public static（先按固定写法）
   返回值类型
      方法执行会有一个结果，这个结果就是返回值
      表示的是方法的返回值的数据类型
      数据类型可以是基本数据类型，也可以是引用数据类型
      返回的时候结合 return --> return ＋ 值（常量、变量、表达式）
      返回值的数据要跟方法声明的返回值类型一致或兼容
   方法名
      用标识符标识方法，给方法起个名字
      使用小驼峰命名，第一个单词首字母小写，剩余单词首字母大写
      起名字的时候最好见名知意
   形式参数列表
      简称形参，作用是：告诉方法，需要什么数据类型的参数，有多少个参数
      形式参数可以是基本数据类型， 也可以是引用数据类型
      语法：
         (数据类型 参数名，数据类型 参数名，...)
      注意：
         形式参数的作用域仅在方法内部，是一个局部变量
         形参中起重要作用的是数据类型那个，而名字叫什么其实无所谓，仅仅起到占位符的作用
   方法体
      { }里面的，就是方法体。我们在方法体中写程序的主要功能
   方法间的关系
      public static 的方法是平行关系， 进行方法调用的时候，跟方法的位置没有关系

（4）改进引例
   方法的调用
      main方法是程序入口，限制性的是main方法
      调用别的方法，要在main方法中直接或间接调用
      static的方法使用的时候，可以直接使用方法名进行调用
      语法：方法名(实际参数列表)
*/
public class Demo {
   public static void test1() {               //test1方法和test2方法，与main方法是平行关系

   }

   public static void test2() {

   }

   public static void main(String[] args) {
      //计算两数和的传统做法，效率低
      int num1= 111;
      int num2 = 222;
      int sum1 = num1+num2;
      System.out.println("sum1="+sum1);            //sum1=333

      //使用方法进行改造
      System.out.println(getSum1(num1,num2));      //333
      //也可以直接传入值
      System.out.println(getSum1(111,222)+100);    //433
      //定义一个和sum4
      int sum2 =getSum1(10,20);
      System.out.println("sum2="+sum2);            //sum2=30

      //直接调用该方法，就可以输出结果
      getSum2();                                   //sum=30

      int sum3 = getSum3(num1+num2);
      System.out.println("sum="+sum3);             //sum=0
   }

   private static int getSum3(int i) {
      return 0 ;
   }

   //选中该方法的方法体，然后 Ctrl+Alt+m，将代码抽取为一个方法
   private static void getSum2() {
      int num3 = 10;
      int num4 = 20;
      int sum = num3 + num4;
      System.out.println("sum="+sum);
   }

   private static int getSum1(int num1, int num2) {      //该方法就是做2个数的和

      return num1 + num2;
   }
}
