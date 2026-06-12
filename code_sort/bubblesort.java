package code_sort;

import java.util.Scanner;

public class bubblesort {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num is: ");
    int num = input.nextInt();

    int[] arrays = new int[num];
    System.out.println("Enter the arrays is: ");
    for (int i = 0; i < num; i++) {
      arrays[i] = input.nextInt();
    }


    bubblesort_up(arrays,0,arrays.length-1);

    output(arrays);

  }


  public static void swap(int[] a,int b,int c){                       //  交换数组中的元素
    int t = a[b];
    a[b] = a[c];
    a[c] = t;
  }


  public static void bubblesort_up(int[] a,int left,int right){              //  冒泡升序排序（left 和 right 都是下标）
    int mon = right-1, flag = 1;

    while(mon >= left && flag == 1){
      flag = 0;

      for(int i =left;i <=mon;i++){
        if(a[i] > a[i+1]) {swap(a,i,i+1); flag = 1;}
      }
      mon--;
    }

  }


  public static void bubblesort_down(int[] a,int left,int right){              //  冒泡降序排序（left 和 right 都是下标）
    int mon = right-1, flag = 1;

    while(mon >= left && flag == 1){
      flag = 0;

      for(int i =left;i <=mon;i++){
        if(a[i] < a[i+1]) {swap(a,i,i+1); flag = 1;}
      }
      mon--;
    }

  }


  public static void output(int... a) {                               //  数组的输出
    for(int e:a){
      System.out.print(e+"  ");
    }
  }

}
