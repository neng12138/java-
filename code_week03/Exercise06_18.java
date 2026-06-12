package code_week03;

import java.util.Scanner;

public class Exercise06_18 {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("The code(8-15位) is: ");
    String code = input.next();

    System.out.println();

    int end = correct(code);
    if(end == 1) System.out.println(" Valid Password! ");
    else if(end == 0) System.out.println(" Invalid Password! ");
    else System.out.println(" 程序错误！ ");


  }

  public static int correct(String code) {

    if(code.length() > 15 || code.length() <8 ) return 0;

    int char_number = 0,digit_number = 0;
    for(int i=0;i<code.length();i++){
      char mon = code.charAt(i);                           // String的 charAt(int index) 用来找string字符串中某个字符

//      if(mon>=48 && mon<=57) digit_number++;
//      else if( (mon>=65 && mon<=90) || (mon>=97 && mon<=122) ) char_number++;
//      else return 0;

      if(Character.isDigit(mon)) digit_number++;                       // char字符的 Character类 方法的调用
      else if(Character.isLetterOrDigit(mon)) char_number++;
      else return 0;


    }

    if(digit_number>=2) return 1;

    return -1;
  }

}
