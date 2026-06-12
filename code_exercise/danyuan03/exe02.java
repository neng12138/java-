package java_code.danyuan03;

import java.util.Scanner;

public class exe02 {
  public static void main(String[] args){                //练习减法

    while(true) {
      int num1 = (int) (Math.random() * 11);             //获取0——10的随机整数
      int num2 = (int) (Math.random() * 11);             //获取0——10的随机整数

      if (num1 < num2) {                             //判断大小(交换)
        int x = num1;
        num1 = num2;
        num2 = x;
      }

      System.out.print("What is " + num1 + " - " + num2 + " ? "+'\n');
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int number = input.nextInt();

      if (number == num1 - num2) System.out.println("  Correct!  ");
      else System.out.println("  Warning!  ");

      System.out.println();

      System.out.print("是否继续（继续请输入1，否则输入0）： ");
      int x = input.nextInt();
      if(x == 0) { System.out.println("  退出成功！  ");break;}

      System.out.println();
      System.out.println();
    }




    //                                   Math.random() =>  生成一个[0,1)的浮点数



  }
}
