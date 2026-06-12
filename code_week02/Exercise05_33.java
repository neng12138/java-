package code_week02;

import java.util.Scanner;

public class Exercise05_33 {
  public static void main(String[] args){
    System.out.println("Enter the number : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    for(int i=1;i<=num;i++){
      int sum=0;
      for(int j=1;j<=i-1;j++){
        if(i%j==0) sum+=j;
      }
      if(sum == i) System.out.println(i);
    }

  }
}
