package java_code.danyuan09;

import java.util.Date;
import java.text.SimpleDateFormat;

public class exe04 {
  public static void main(String[] args) {
    System.out.println();

    // public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    Date date = new Date();


    // 内部的Date类，肯定将toString方法进行了重写，所以我们得到的不是一个地址；
    System.out.println(date);
//    System.out.println(date.toString());


    // 使用本地化的一个字符串形式来查看日期
    System.out.println(date.toLocaleString());



    // public Date()：分配一个 Date对象，并将其初始化
    Date date1 = new Date();
    //  new SimpleDateFormat( 日期格式 ).format( Data类定义的对象名 )
    System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(date1));


//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//    String s = sdf.format(date);
//    System.out.println(s);


  }
}





//                               Date类 :  生 成 当 前 的 精 确 时 间           （  import java.util.Date;  ）


//                               =>  1. Date  对象名  =  new  Date();                         //  定义一个Date类的对象


//                              =>  2.  输出方式   ：    对象名  或   对象名. toString()

//                                                     对象名. toLocaleString()               //  返回的日期格式（String）比较好




//                             SimpleDateFormat  ： 规定日期输出格式    （ import java.text.SimpleDateFormat; ）

//                               =>  new SimpleDateFormat( 日期格式 ).format( Data类定义的对象名 )       // 匿名的SimpleDateFormat类的引用对象

//                                   （  日期格式 ： "yyyy年MM月dd日 HH:mm:ss"   或   "yyyy年MM月dd日"  等等）





