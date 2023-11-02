package com.fudan._01identifer;

/*
* 标识符的开头必须是：
* 字母
* 下划线
* 美元符号
* Unicode字符集中编号为0xC0以及它后面的所有符号
*
* 标识符的组成必须是：
* 数字
* 字母
* 美元符号
* 下划线(_)
* Unicode字符集中编号为0XC0以及它后面的所有符号
*
*
* 通过以上标识符的语法要求，做几个总结：
* 1.标识符不能以数字开头，但是可以有数组组成
* 2.0XC0是一个十六进制书，Unicode字符集中编号为OXC0后面的字符，几乎包含了世界上绝大多数非英语国家的文字字符
*  所以标识符的命名从语法上来讲，直接使用中文是可以的，但是不允许使用。
* 3.Unicode字符集兼容ASCII码表，Unicode字符集中前128个字符就是ASCII码表中的字符
*  ∴Unicode 字符集中编号为哦XC以及它后面的所有符号是不含很多常用英语字符的，比如：英文逗号、英语句号、空格、回车等
*
*  标识符不能是java中的关键字和保留字，并且严格区分大小写
*
*
*  见识初学者在定义标识符时要遵循以下几点规范：
*  1.包名所有字母一律小写，例如com.cskaoyan.example01(多级报名容","隔开)
*  2.类和接口中的每个单词的首字母大写，例如Student、Runable、MyFilterProgram
*  2.常用名所有字母都大写，单词之间用下划线连接，例如STUDENT_MAX_AGE
*  2.变量名和方法名的第一个单词首字母小写，从第二个单词开始每个首字母大写，例如：userName，getStudentName
*
*
*  约定俗成的规范
*
*  1、标识符字符串尽量使用合法的英文单词（少数特殊情况可以使用拼音）
*  2、标识符字符串尽量只使用英文和阿拉伯数字
*  3、不要使用“$”美元符号，它在命名中有特殊含义，除开特殊场景不要使用它
*  4、尽量不要使用“_”下划线，它在命名中有特殊含义，除开特殊场景不要使用它
*  5、“$”和“_”即便出现，也要严谨作为开头和结尾!
*
* */
public class Demo {
   public static void main(String[] args){
      int a =1;
      int A =1;
      int _A =1;
      int $A =1;
      int 你 =1;
      int の =1;

      int a1=1;
      int a2 =1;
      int a$ =1;
      int a_=1;

      //最大年龄
      //小驼峰
      int maxAge=60;

      //常量命名，单词全部大写，中间用下划线连接
      final int STUDENT_MAX_AGE = 10;

      // 变量命名 小驼峰
      int userName;

   }

   //方法命名
   // 一个单词
   private static void test(){

   }
   //多个单词
   public static void getMaxAge() {

   }


}

//类的命名 大驼峰
class StudentAge{

}
