package com.fudan._03memory;
/*  从3个角度来分析问题：
（1）存储的类型
   1.堆上存储的是 new出来的东西，是引用数据类型的实质-->对象
   2.栈上存储的是局部变量（基本数据类型和引用数据类型的引用）
（2）默认值
   1.堆上对象中的变量具有默认值：
      1）整形（byte、short、int、long）默认值为0；
      2）浮点类型（float、double）默认值是0.0；
      3）字符类型（char）默认值是'\u0000'，表示编码值为0的字符，一个绝对空字符；
      4）布尔类型（boolean）的默认值是false；
      5）引用数据类型的默认值是 null
         -- null既不是对象也不是任何一种数据类型，它仅仅是一个特殊的值；
         -- 任何引用数据类型的引用都可以指向null，指向null并不意味着没有初始化；
         可以认为引用指向了虚无，反正没有指向任何一个对象
         -- 对象才是引用数据类型的实质，没有指向对象的引用实际上没有任何意义；
         -- 指向null的引用是无法正常使用的!!!
         -- 基本数据类型不能等于null
   2.栈上的局部变量没有默认值，声明局部变量后必须是显示的初始化，否则无法使用。
（3）生命周期
   1.堆上的对象使用完毕后，随着方法的出栈，对象的引用会被销毁；
     这个时候就没有引用指向该对象，它就会“孤零零”的单独存在于堆上。
     -- 我们无法再使用这种对象，它也没有了意义。
     1）在Java中，我们将这种对象称之为“垃圾”或“垃圾对象”，它们会等待垃圾回收器的回收；
     2）Java的垃圾回收机制（简称GC：Garbage Collection）
        --堆上的对象变成“垃圾”之后， 并不是立马就会被回收，而是需要GV通过一系列的算法来决定它是否被回收。
     3）具体的算法有：
        标记清除算法
        标记复制算法
        标记整理算法
        分代收集算法
     4）Java中的GC是全自动的，程序员几乎无法干涉和主动回收“垃圾对象”。
        ** 主动回收方法：System.gc()方法 **
        -- 一方面为Java程序员的开发节省了大量的精力（无需花费大量精力来管理堆内存），
           相比于C++的全手动回收“垃圾对象”,Java在机制上的创新是JAVA语言能够如此流行的原因之一。
           但是另一方面，一旦GC这种机制出现问题，对Java而言就会是一个非常难以解决的问题
        -- 垃圾回收机制是一道墙，有的人想进来，有的人想出去
            C++:分配内存 malloc()     释放内存 free() -->内存泄漏
   2.栈上的局部变量的生命周期，与栈帧保持一致。方法栈帧进栈后，局部变量就会开辟空间并生效。
     方法出栈后，局部变量就被销毁了。
*/
public class Demo4 {
   public static void main(String[] args) {
      //整形
      byte[] bytes = new byte[2];
      short[] shorts = new short[2];
      int[] ints = new int[2];
      long[] longs = new long[2];
      //浮点型
      float[] floats = new float[3];
      double[] doubles = new double[3];
      //字符型
      char[] chars = new char[4];
      //布尔型
      boolean[] booleans = new boolean[5];
      //引用类型
      String[] strings = new String[6];

      //下面打印各种数据类型数组的默认值
      //选择去打印数组对象中的第一个值
      System.out.println("bytes="+bytes[0]);             //bytes=0
      System.out.println("shorts="+shorts[0]);           //shorts=0
      System.out.println("ints="+ints[0]);               //ints=0
      System.out.println("longs="+longs[0]);             //longs=0
      System.out.println("floats="+floats[0]);           //floats=0.0
      System.out.println("doubles="+doubles[0]);         //doubles=0.0
      System.out.println("chars="+chars[0]);             //chars=         //（1）
      System.out.println("booleans="+booleans[0]);       //booleans=false
      System.out.println("strings="+strings[0]);         //strings=null


      //可以打印空数组的地址
      int[] arr = null;
      System.out.println(arr);               //null-->该变量不指向任何实际的对象，它是空的
      // 不能打印空数组的长度
      // java.lang.NullPointerException
      // System.out.println(arr.length);

      //基本数据类型不能为null
      // int a = null;        //Incompatible types.Required:int  Found:null
   }
}
//解释：（1）
//由于字符数组中的元素默认初始化为字符的 Unicode 值为 0，所以它会打印出空字符（\u0000 或者直接就是一个空格）。
// 而字符数组中第一个元素的默认值是空字符，而你尝试打印它时，只会得到一个空字符串。
