package java_code.danyuan08;

import java.util.Arrays;
import java.util.Scanner;

public class exe01 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the n_hang:");
    int n_hang = input.nextInt();

    System.out.print("Enter the n_lie:");
    int n_lie = input.nextInt();

    int[][] mon = new int[n_hang][n_lie];                     // 定义二维数组mon

    input(mon);                                              //  调用函数输入二维数组mon

    output(mon);                                             //  调用函数输出二维数组mon


  }


  public static void output(int[][] mon) {                      //  java二维数组的输入要用到二重循环
    System.out.println('\n'+"The array is: ");

    for (int i = 0; i < mon.length; i++) {
      for (int j = 0; j < mon[i].length; j++) {
        System.out.print(mon[i][j]+"  ");
      }
      System.out.println();
    }

  }


  public static void input(int[][] mon) {                        // java二维数组的输入要用到二重循环
    System.out.println('\n'+"Enter the array: ");

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < mon.length; i++) {
      for (int j = 0; j < mon[i].length; j++) {
        mon[i][j] = input.nextInt();
      }
    }

  }



  //                                java二维数组的定义：      数据类型[][]  数组名;

  //                                java二维数组申请空间：      数组名 = new  数组的数据类型[ 数组的行数 ][ 数组的列数 ];



  //                                java二维数组的总行数：    数组名.length

  //                                java二维数组某行的列数:      数组名[x].length   ( 表示下标为x那行的列数 )


}
