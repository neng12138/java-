package java_code.danyuan06;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args) {             //求从 num1 到 num2 的整数和（用到了java的函数调用）
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter the num2 : " );
    int num2=input.nextInt();


    System.out.println();
    int end = summation(num1,num2);                    // 调用summation函数（形参改变不了实参）
    System.out.println("The sum is: " + end );

  }


  public static int summation(int num1,int num2) {        // java函数（要写在class类中）
    int sum = 0;

    if(num1 > num2){
      int x = num1;
      num1 = num2;
      num2 = x;
    }

    for(int i=num1;i<=num2;i++) sum += i;

    return sum;
  }



  //            java函数的形式：
  //                                   pubilc  static  数据类型  函数名（    ）
  //                                 {             函数体；                   }


  //            java函数的调用：       函数名（  ） ；

}
