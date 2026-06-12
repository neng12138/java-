package java_code.danyuan12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    System.out.println();
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {

      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();                          //   只要是要输入时，输入的数据类型与要求类型不匹配，就会抛出 InputMismatchException异常

        System.out.println("The number entered is "+number);

        continueInput = false;
      }
      catch (InputMismatchException ex){
        System.out.println("Try again. ( Incorrect input: an integer is required )");
//        System.out.println(ex.getMessage());

        input.nextLine();                                    //   接 收 输 入 上 一 个 数 据 最 后 的 回 车  ( 必要 )
      }

    }
    while (continueInput);

  }
}



//                       InputMismatchException异常      ：     输 入 类 型 不 匹 配 异 常