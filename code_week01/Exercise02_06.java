package code_week01;

import java.util.Scanner;

public class Exercise02_06 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000:");
    int integer = input.nextInt();

    int sum = 0;

    while(integer !=0){
      int x = integer % 10;
      sum += x;
      integer /= 10;
    }

    System.out.println("The sum of the digits is " + sum);
  }
}
