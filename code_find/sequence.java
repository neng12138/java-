package code_find;

import java.util.Scanner;

public class sequence {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num is: ");
    int num = input.nextInt();

    System.out.print("Enter the e is: ");
    int e = input.nextInt();

    int[] arrays = new int[num];
    System.out.println("Enter the arrays is: ");
    for (int i = 0; i < num; i++) {
      arrays[i] = input.nextInt();
    }


    int k = find(arrays,arrays.length,e);
    System.out.println("The k is: "+k);

  }


  public static int find(int[] a,int n,int e){                            //  顺序查找

    for(int i=0;i<n;i++){
      if(a[i] == e) return i;
    }

    return -1;

  }

}
