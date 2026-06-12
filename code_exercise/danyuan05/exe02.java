package java_code.danyuan05;

import java.util.Scanner;

public class exe02 {
  public static void main(String[] args) {                        // 求两个整数的最大公约数
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num1: ");
    int num1 = input.nextInt();

    System.out.print("Enter the num2: ");
    int num2 = input.nextInt();


    int end = 1;
    for(int i=2;i<=num1&&i<=num2;i++){                           // 循环求最大公约数
      if(num1 % i == 0&&num2 % i==0){
        if(i >= end) end=i;
      }
    }


    System.out.println();
    System.out.println("最大公约数为： "+ end);
  }
}
