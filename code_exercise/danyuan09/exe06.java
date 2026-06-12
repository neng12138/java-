package java_code.danyuan09;


import java.util.Scanner;

public class exe06 {
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

//    int k = code_find.binary.find_recursion(arrays,0,num-1,5);
//    System.out.println(k);


    code_sort.mergesort.mergesort_down(arrays,0,num-1);

    code_sort.quicksort.output(arrays);

    code_createdate.code_Date.outputdate();
  }
}





//                      调用其他Package中的某个java class中的函数 ：

//                                                         =>  Package名  .  class名  .  函数名（）;


//                                          （      不 需 考 虑 是 否 需 要 导 入 调 用 函 数 中 用 到 的 库  ， 直 接 使 用 函 数      ）





