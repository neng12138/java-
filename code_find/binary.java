package code_find;

import java.util.Arrays;
import java.util.Scanner;

public class binary {
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

    Arrays.sort(arrays);                                      // 升序排列

    int k = find(arrays,0,arrays.length-1,e);
    System.out.println("The k is: "+ k);

    int k_recursion = find_recursion(arrays,0,arrays.length-1,e);
    System.out.println("The k_recursion is: "+ k_recursion);



  }


  public static int find(int[] a,int left,int right,int e){                        //  迭代二分查找（left 和 right 都是下标）

    while(left <= right){
      int mid = (left+right)/2;

      if(a[mid] == e) return mid;
      else if(a[mid] > e) right=mid-1;
      else left=mid+1;
    }

    return -1;
  }



  public static int find_recursion(int[] a,int left,int right,int e){              //  递归二分查找（left 和 right 都是下标）
	if(left > right) return -1;

	int mid = (left+right)/2;

	if(a[mid] == e) return mid;
	else if(a[mid] > e) return find_recursion(a,left,mid-1,e);
	else return find_recursion(a,mid+1,right,e);
}


}
