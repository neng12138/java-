package java_code.danyuan05;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args){                           //  猜数字游戏
    System.out.println();

    int number = (int)(Math.random()*101);                          // 生成一个1——100的整数

    Scanner input = new Scanner(System.in);

    while(true){
      System.out.print("Enter the num: ");
      int num = input.nextInt();


      if(num == number) {System.out.println("  Correct!  "); break; }
      else if(num > number ) System.out.println("The num is too high!  ");
      else System.out.println("The num is too low! ");

      System.out.println();
    }

  }



  //                          死循环：  1. while(true)           2. for(; ;)

  //                         break=>跳出循环              continue=>跳出本次循环


}
