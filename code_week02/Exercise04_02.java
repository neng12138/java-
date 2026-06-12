package code_week02;

import java.util.Scanner;

public class Exercise04_02 {
  public static void main(String[] args){

    double x1,y1,x2,y2;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter point 1 (latitude and longitude) in degrees:" );
    x1 = Math.toRadians(input.nextDouble());
    y1 = Math.toRadians(input.nextDouble());
    System.out.println("Enter point 2 (latitude and longitude) in degrees:" );
    x2 = Math.toRadians(input.nextDouble());
    y2 = Math.toRadians(input.nextDouble());

    double r = 6371.01,d;
    double mon=(Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
    d = r*(Math.acos(mon));

    System.out.println("The distance between the two points is "+ d + " km ");
  }
}
