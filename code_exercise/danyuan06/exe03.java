package java_code.danyuan06;

import java.util.Scanner;

public class exe03 {
  public static void main(String[] args) {             //  String的charAt()方法  和  char的Character类
    System.out.println();

    String str = "Hello world";

    for(int i=0;i<str.length();i++){

      char one_char = str.charAt(i);                  // charAt(int index) 用来获取字符串中的某个字符
      System.out.print(one_char);

    }

    System.out.println();

    System.out.print('\n' + "Enter one char: ");
    Scanner input = new Scanner(System.in);
    String e = input.next();
    char true_char = e.charAt(0);                    // java不能直接输入char的单个字符( 可以用charAt()来得到输入的String的第一个数充当输入了一个char字符 )


    if(Character.isLetter(true_char)) System.out.println("The first char is the Letter ");             // Character.isLetter()判断字母
    else if(Character.isDigit(true_char)) System.out.println("The first char is the Digit");           // Character.isDigit()判断数字
    else System.out.println("The first char is the specific symbol");


    //                    String 的 charAt()方法：   char s = str.charAt(int index);


    //                    char 的 Character类：      1.Character.isDigit(x)     = >  如果x是数字就返回true

    //                                              2.Character.isLetter(x)    = >  如果x是字母就返回true

    //                                              3.Character.isDigitOrLetter(x)   = >  如果x是数字或字母就返回true

    //                                              4.Character.isLowerCase(x)   = >  如果x是小写字母就返回true

    //                                              5.Character.isUpperCase(x)   = >  如果x是大写字母就返回true


    //                                              6.Character.toLowerCase(x)   = >  返回x的小写字母的字符状态

    //                                              7.Character.toUpperCase(x)   = >  返回x的大写字母的字符状态


  }
}
