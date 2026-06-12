package code_week01;

import java.util.Scanner;

public class Exercise02_01 {
  public static void main( String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in Celsius:");
    double degree = input.nextDouble();

    double fixdegree = (9.0/5)*degree+32;
    System.out.println(degree + " Celsius is " + fixdegree + " Fahrenheit");
  }
}
