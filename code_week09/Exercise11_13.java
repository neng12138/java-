package code_week09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
  public static void main(String[] args) {
    System.out.println();

    ArrayList<Integer> list = new ArrayList<>();

    removeDuplicate(list);
  }


  public static void removeDuplicate(ArrayList<Integer> list){
    System.out.print("Enter ten integers: ");
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      int x = input.nextInt();

      int flag = 0;
      for (int j = 0; j < list.size(); j++) {
        if(list.get(j)==x) flag = 1;
      }

      if(flag==0) list.add(x);
    }

    System.out.print("The distinct integers are ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }
  }

}
