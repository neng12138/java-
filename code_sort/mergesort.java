package code_sort;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num is: ");
    int num = input.nextInt();

    int[] arrays = new int[num];
    System.out.println("Enter the arrays is: ");
    for (int i = 0; i < arrays.length; i++) {
      arrays[i] = input.nextInt();
    }


    mergesort_down(arrays,0,num-1);

    output(arrays);

  }



  public static void mergesort_up(int[] a,int left,int right){                 // 归并升序排列（left 和 right 都是下标）
    if(left<right){
      int mid = (left+right)/2;

      mergesort_up(a,left,mid);
      mergesort_up(a,mid+1,right);

      merge_up(a,left,mid,right);
    }
  }


  public static void merge_up(int[] a,int left,int mid,int right){                 //  升序归并过程
    int[] b =new int[a.length];
//    Arrays.fill(b,0);

    int i=left,j=mid+1,k=left;
    while(i<=mid && j<=right){
      if(a[i]<=a[j])  b[k++]=a[i++];
      else  b[k++]=a[j++];
    }

    if(i>mid){
      for(int q=j;q<=right;q++) b[k++]=a[q];
    }
    else for(int q=i;q<=mid;q++) b[k++]=a[q];


    for(int p=left;p<=right;p++) a[p]=b[p];

  }


  public static void mergesort_down(int[] a,int left,int right){                 // 归并降序排列（left 和 right 都是下标）
    if(left<right){
      int mid = (left+right)/2;

      mergesort_down(a,left,mid);
      mergesort_down(a,mid+1,right);

      merge_down(a,left,mid,right);
    }
  }


  public static void merge_down(int[] a,int left,int mid,int right){                 //  降序归并过程
    int[] b =new int[a.length];
//    Arrays.fill(b,0);

    int i=left,j=mid+1,k=left;
    while(i<=mid && j<=right){
      if(a[i]>=a[j])  b[k++]=a[i++];
      else  b[k++]=a[j++];
    }

    if(i>mid){
      for(int q=j;q<=right;q++) b[k++]=a[q];
    }
    else for(int q=i;q<=mid;q++) b[k++]=a[q];


    for(int p=left;p<=right;p++) a[p]=b[p];

  }


  public static void output(int... a) {                                           //  数组的输出
    for (int e:a) {
      System.out.print(e+"  ");
    }
  }

}
