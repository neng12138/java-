package code_week11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
  public static void main(String[] args) {
    System.out.println();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two integers: ");
    do {                                                         //   do-while()死循环，不断接收输入值
      try {

        int number1 = input.nextInt();                        //   nextLint()只能接收整数，输入其他类型会抛出InputMismatchException异常
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum is: "+sum);
        break;
      }
      catch (InputMismatchException ex){
        input.nextLine();                                                   //   接 收 回 车
        System.out.println("\nAccess InputMismatchException Error");
        System.out.print("Please enter again two integers: ");
      }
    }
    while (true);


  }
}



//                        InputMismatchException异常     ：     输 入 类 型 不 匹 配
