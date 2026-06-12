package code_sort;

import java.util.Scanner;

public class binarysort {
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


    binarysort_up(arrays,0,arrays.length-1);

    output(arrays);

  }


  public static void binarysort_up(int[] a,int left_t,int right_t){                  //  二分升序排序（left_t 和 right_t 都是下标）

    for(int i=left_t+1;i<=right_t;i++){
      int e = a[i];
      int left = left_t, right = i-1;

      while(left<=right){
        int mid=(left+right)/2;

        if(a[mid]>e) right=mid-1;
        else left=mid+1;
      }

      for(int j=i-1;j>=right+1;j--) a[j+1]=a[j];

      a[right+1]=e;
    }
  }


  public static void binarysort_down(int[] a,int left_t,int right_t){                  //  二分降序排序（left_t 和 right_t 都是下标）

    for(int i=left_t+1;i<=right_t;i++){
      int e = a[i];
      int left = left_t, right = i-1;

      while(left<=right){
        int mid=(left+right)/2;

        if(a[mid]<e) right=mid-1;
        else left=mid+1;
      }

      for(int j=i-1;j>=right+1;j--) a[j+1]=a[j];

      a[right+1]=e;
    }
  }


  public static void output(int... a) {                                         //  数组的输出
    for(int e:a){
      System.out.print(e+"  ");
    }
  }


}
