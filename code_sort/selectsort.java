package code_sort;

import java.util.Scanner;

public class selectsort {
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


    selectsort_up(arrays,0,arrays.length-1);

    output(arrays);

  }


  public  static void swap(int[] a,int b,int c){                            //  数组中元素的交换
    int t=a[b];
    a[b] = a[c];
    a[c] = t;
  }


  public static void selectsort_up(int[] a,int left,int right){                //  直接选择升序排序（left 和 right 都是下标）
    for(int i=left;i<right;i++){
      int k = i;

      for(int j=i+1;j<=right;j++){
        if(a[k] > a[j]) k=j;
      }

      if(k != i) swap(a,k,i);
    }
  }


  public static void selectsort_down(int[] a,int left,int right){                //  直接选择降序排序（left 和 right 都是下标）
    for(int i=left;i<right;i++){
      int k = i;

      for(int j=i+1;j<=right;j++){
        if(a[k] < a[j]) k=j;
      }

      if(k != i) swap(a,k,i);
    }
  }



  public static void output(int... a) {                                       //  数组的输出
    for(int e:a){
      System.out.print(e+"  ");
    }
  }


}
