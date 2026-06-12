package code_week03;

import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num is: ");
    int num = input.nextInt();

    int end_number = mon(num);
    double end = (double)end_number/num;

    System.out.println();
    System.out.print("The final probability is: ");
    System.out.printf("%f",end);

  }

  public static int mon(int num) {
    int number = 0;

    for(int i = 1;i <= num;i++) {
      double numx = Math.random() * 2 - 1;
      double numy = Math.random() * 2 - 1;

      if(numx < 0 || (numx>0 && numy>0 && numy<(-numx)+1 )) number++;

    }

    return number;
  }

}
