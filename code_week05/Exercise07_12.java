package code_week05;

import java.util.Scanner;

public class Exercise07_12 {
  public static void main(String[] args) {
    System.out.println();

    int[] mon = new int[10];                                     // 定义一个长度为10的数组


    System.out.println("Enter the numbers(10): ");
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < mon.length; i++) {
      mon[i] = input.nextInt();                                //  循环输入数组
    }


    int[] num = inversion(mon);                                // 调用 inversion 函数（返回倒置的数组）

    System.out.println();

    System.out.println("The inverted numbers is:");
    for(int i=0;i<num.length;i++){
      System.out.print(num[i] + " ");                          //  循环输出 倒置的数组的数据
    }

  }

  public static int[] inversion(int... mon) {                        // 定义一个inversion 函数倒置数组，再把倒置的数组返回
    int[] num = new int[mon.length];

//    for(int i=mon.length-1,j=0;i>=0;i--,j++){
//      num[j] = mon[i];
//    }

    for(int i=0;i<mon.length;i++){
      num[i] = mon[mon.length-1-i];
    }


    return num;                              //  只有java可以把数组在函数中直接返回，C++不可以在函数中返回数组

  }


}
