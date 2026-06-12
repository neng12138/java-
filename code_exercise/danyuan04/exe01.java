package java_code.danyuan04;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args){                     // 字符串的输入与输出

    System.out.println();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the name01: ");
    String name01;
    name01 = input.next();                         //  .next() 方法不能识别空格
    System.out.println("The name01 is: "+ name01 + "   The length is: "+ name01.length());

    System.out.println();
    System.out.println();

    input.nextLine();                                 //  input.nextLine()  用来接收第一个的回车，否则name02接收正确的输入值

    System.out.print("Enter the name02: ");
    String name02;
    name02 = input.nextLine();                     //  .nextLine()  方法可以识别空格
    System.out.println("The name01 is: "+ name02 + "   The length is: "+ name02.length());
  }



  //                           String的输入:   1. input.next()  => 不能识别空格

  //                                          2. input.nextLine()  =>  能识别空格



  //                          String 的方法：  1. 变量名 . length()   =>  字符串的长度

  //                                          2. 变量名 . charAt（int index）  => 返回字符串中的某个字符 (0 ~ n-1)

}
