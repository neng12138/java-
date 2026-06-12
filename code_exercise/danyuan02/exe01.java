package java_code.danyuan02;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args){

//    final double PI = 3.14159;                       //引用命名常量

    double audius,area;
//    area = 20;

    Scanner input = new Scanner(System.in);           // 指定input为Scanner对象
    System.out.print("Enter the area: ");
    area = input.nextDouble();                       //输入数据

    audius = area *area *3.14159;
//    audius = Math.pow(area,2)*3.14159;             //使用Math.pow（）方法
//    audius = area * area * PI;

    System.out.println("The audius is: " + audius);




    //                 输入：     1. 导包(  import java.util.Scanner)

    //                           2. 指定 input 为 Scanner的对象  （Scanner input = new Scanner(System.in); ）

    //                           3. 调用 input 的方法


  }
}
