package com.fudan._07expression;

/*
表达式类型提升

如果表达式中存在多种数据类型，有变量参与运算
∵表达式的运算结果是唯一的，
∴“结果变量”的数据类型将会提升到“最大取值范围”的那一个。其规则如下：

1.byte、short、char之间不互相转换，一旦发生运算，一律自动转换为 int进行计算，结果也是 int
2.byte、short、char任何数据类型与 int进行计算，一律自动转换为 int进行计算，结果也是 int
3.byte、short、char、int任何数据类型与long进行计算，一律自动转换为 long进行计算，结果也是 long
4.byte、short、char、int、long任何数据类型与 float进行计算，一律自动转换为 float进行结算，结果也是 float
5.byte、short、char、int、long任何数据类型与 double进行计算，一律自动转换为 double进行结算，结果也是 double

特殊情况
String 字符串类型可以使用 + 进行计算，效果是字符串的拼接，最终结果是String类型
*/
public class Demo1 {
   public static void main(String[] args) {
      // 1.byte、short、char之间不互相转换，一旦发生运算，一律自动转换为 int进行计算，结果也是 int
      // byte + byte = int
      byte b1 = 1;
      byte b2 = 2;
      // byte a1 = b1+ b2;
      // Incompatible types. Required:byte  Found:int
      int a1 = b1 + b2;            //这样就对了。因为byte+byte在计算时，当做int处理，结果是int，也用int接收
      byte b3 = (byte) (b1 + b2);    //但是也可以强转为byte

      // short + byte = int
      short s1 = 10;
      // short s2 = s1 + b1;        //Incompatible types. Required:short  Found:int
      // byte b4 = s1 + b1;         //Incompatible types. Required:byte  Found:int
      int i1 = s1 + b1;             //使用int来接收，就对了
      //或者可以进行强转，如：
      short s2 = (short) (s1 + b1);
      byte b4 = (byte) (s1 + b1);

      // char + short = int
      char c = 'a';
      int result = c + s1;
      System.out.println("result" + result);       //result107（字符串拼接）
      System.out.println(result + "result");       //107result（字符串拼接）

      // 2.byte、short、char任何数据类型与 int进行计算，一律自动转换为 int进行计算，结果也是 int
      // byte + int = int
      int result1 = b1 + i1;
      //byte b5 = b1 + i1;      //Incompatible types. Required:byte  Found:int
      byte b5 = (byte) (b1 + i1);       //强转一下也可以

      // 3.byte、short、char、int任何数据类型与long进行计算，一律自动转换为 long进行计算，结果也是 long
      // int + long = long
      long l1 = 111L;
      long L2 = i1 + l1;
      //int i2 = i1+ l1;           //Incompatible types. Required:int  Found:long
      int i2 = (int) (i1 + l1);             //强转一下也可以

      // 4.byte、short、char、int、long任何数据类型与 float进行计算，一律自动转换为 float进行结算，结果也是 float
      float f1 = 3.14F;
      // byte + float = float
      float f2 = b1 + f1;
      //byte b6 = b1 + f1;          //Incompatible types. Required:byte  Found:float
      byte b7 = (byte) (b1 + f1);        //强转一下也可以

      // 5.byte、short、char、int、long任何数据类型与 double进行计算，一律自动转换为 double进行结算，结果也是 double
      double d1 = 1.288;
      // byte + int + double = double
      double d2 = d1 + i1 + b1;
      //byte b6 = d1 + i1 + b1;       //Incompatible types. Required:byte  Found:double
      //int i6 = d1 + i1 + b1;        //Incompatible types. Required:int  Found:double
      //可以做强转
      byte b6 = (byte) (d1 + i1 + b1);
      int i6 = (int) (d1 + i1 + b1);


      //6.思考
      byte num = 1 + 2;
      //byte num2 = 127+1;          //Incompatible types. Required:byte  Found:int
      //127+1，已经超出了byte的范围，变为了一个int的数字
      //可以做强转
      byte num2 = (byte) (127 + 1);
   }
}
