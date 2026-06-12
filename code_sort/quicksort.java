package code_sort;

import java.util.Scanner;

public class quicksort {
  public static void main(String[] args) {
    System.out.println();

    Scanner input =new Scanner(System.in);
    System.out.print("Enter the num is: ");
    int num = input.nextInt();

    System.out.println("Enter the arrays is: ");
    int[] arrays = new int[num];
    for (int i = 0; i < arrays.length; i++) {
      arrays[i] = input.nextInt();
    }


    quicksort_up(arrays,0,num-1);

    output(arrays);

  }


  public static void quicksort_up(int[] a,int left,int right){                   // 快速升序排序（left 和 right 都是下标）
    if(left<right){
      int mid = partiton_up(a,left,right);

      quicksort_up(a,left,mid-1);
      quicksort_up(a,mid+1,right);
    }
  }


  public static int partiton_up(int[] a,int left,int right) {                     //  升序划分过程
    int x = a[left];
    int i = left,j = right+1;

    while(true){
      while (a[++i]<x && i<right);
      while (a[--j]>x);

      if(i>=j) break;
      swap(a,i,j);
    }
    a[left] = a[j];
    a[j] = x;

    return j;
  }


  public static void quicksort_down(int[] a,int left,int right){                   // 快速降序排序（left 和 right 都是下标）
    if(left<right){
      int mid = partiton_down(a,left,right);

      quicksort_down(a,left,mid-1);
      quicksort_down(a,mid+1,right);
    }
  }


  public static int partiton_down(int[] a,int left,int right) {                     //  降序划分过程
    int x = a[left];
    int i = left,j = right+1;

    while(true){
      while (a[++i]>x && i<right);
      while (a[--j]<x);

      if(i>=j) break;
      swap(a,i,j);
    }
    a[left] = a[j];
    a[j] = x;

    return j;
  }



  public static void swap(int[] a,int b,int c) {                               //  数组中数据的交换
    int t = a[b];
    a[b] = a[c];
    a[c] = t;
  }


  public static void output(int... a) {                                      //  数组的输出
    for (int e:a) {
      System.out.print(e+"  ");
    }
  }


}
