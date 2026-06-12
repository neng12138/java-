package code_week02;

import java.util.Scanner;
public class Exercise05_23 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the num : ");
    int n = input.nextInt();

    double num1=0, num2=0;

    //                      从左向右算
    for(double i=1;i<=n;i++){
      num1 += 1/i;
    }

    //                      从右向左算
    for(double j=n;j>=1;j--){
      num2 += 1/j;
    }

    System.out.println(num1);
    System.out.println(num2);

  }
}

