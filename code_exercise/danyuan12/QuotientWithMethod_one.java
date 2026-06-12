package java_code.danyuan12;

import java.util.Scanner;

public class QuotientWithMethod_one {
  public static int quotient(int number1,int number2){
    if(number2 == 0){                                             //  if()  判断
      System.out.println("Divisor cannot be zero");
      System.exit(1);                                     //  System.exit(1)  =>  直 接 退 出 程 序
    }

    return number1/number2;
  }

  public static void main(String[] args) {
    System.out.println();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    int result = quotient(number1,number2);
    System.out.println(number1+" / "+number2+" is "+result);
  }
}


//                         System.exit(1)  =>  正 常 退 出 程 序 （ 用于终止程序 ）

//                         System.exit(0)  =>  异 常 退 出 程 序 （ 用于终止程序 ）