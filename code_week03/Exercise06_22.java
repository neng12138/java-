package code_week03;

import java.util.Scanner;

public class Exercise06_22 {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the n: ");
    long n = input.nextLong();

    System.out.println();

    double end = sqrt(n);
    System.out.println("The sqrt(n) is: " + end);

  }

  public static double sqrt(long n) {
    long nextGuess,lastGuess = 1;

    while(true){
      nextGuess = (lastGuess +n/lastGuess )/2;
      if(Math.abs(nextGuess - lastGuess) < 0.0001) break;
      else lastGuess = nextGuess;
    }

    return nextGuess;

  }

}
