package code_week01;

import java.util.Scanner;

public class Exercise02_13 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the monthly saving amount:");
    double account = input.nextDouble();

    System.out.println("Enter after monthly:");
    int mon = input.nextInt();

    double sum = 0;
//    rate = ( 1 + 0.00417 );

    for(int i=1;i<=mon;i++){
      sum = (account + sum ) * ( 1 + 0.00417 ) ;
    }

    if( mon == 0) sum = 100;
    System.out.println("After the " + mon + " month , the account value is $"+ (float)sum);
  }
}
