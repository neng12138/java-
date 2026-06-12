package java_code.danyuan07;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args) {
    System.out.println();


    Scanner input = new Scanner(System.in);
    System.out.print("Enter thr num: ");
    int num = input.nextInt();                                   // 输入要定义的数组的大小

    System.out.println();


    System.out.print("Enter the array: ");
    double[] array = new double[num];                          //定义数组array 并且直接 num 个申请空间


    for(int i=0;i<array.length;i++) array[i] = input.nextDouble();                // 输入数组的值



    System.out.println();
    for(int i=0;i<array.length;i++) System.out.printf(" %-5.0f ",array[i]);               // 输出数组的值




    //                             数组的定义：        数据类型[]  数组名；

    //                            数组申请空间：        数组名 = new  数组的数据类型[ 数组大小 ]；


  }
}
