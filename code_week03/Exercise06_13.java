package code_week03;

import java.util.Scanner;

public class Exercise06_13 {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the i: ");
    double i = input.nextDouble();

    System.out.println();

    summation(i);

  }

  public static void summation(double i) {
    System.out.printf("%-10s %10s \n","i","m(i)");        // s表示字符串
    System.out.println("—————————————————————");

    double sum = 0;
    for(double j = 1;j <= i;j++){
      sum += j/(j+1);
      System.out.printf("%-10.0f %10.4f \n",j,sum);      // f表示十进制浮点数，d表示十进制整数
    }

  }

}
